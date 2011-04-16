package werkzeugkasten.mvnhack.repository.impl;

import java.io.File;
import java.util.Properties;

import werkzeugkasten.common.util.StringUtil;
import werkzeugkasten.common.util.UrlUtil;
import werkzeugkasten.mvnhack.Constants;

public class PropertiesConfiguration extends AbstractConfiguration {

	public PropertiesConfiguration() {
	}

	public PropertiesConfiguration(Properties properties) {
		load();
		load(properties);
	}

	protected void load() {
		File cur = new File(".", Constants.DIR_REPOSITORY);
		if (cur.exists()) {
			addLocalRepository(cur);
		}
		StringBuilder stb = new StringBuilder();
		stb.append(".m2");
		stb.append('/');
		stb.append(Constants.DIR_REPOSITORY);
		File usr = new File(System.getProperty("user.home"), stb.toString());
		if (usr.exists()) {
			addLocalRepository(usr);
		}

		addRepository(new RemoteRepository(Constants.CENTRAL_REPOSITORY,
				builder));
	}

	protected void load(Properties properties) {
		String rs = properties.getProperty(Constants.PROP_REPOSITORY);
		if (StringUtil.isEmpty(rs) == false) {
			for (String s : rs.split(",")) {
				if (validateURL(s)) {
					addRepository(new RemoteRepository(s, builder));
				}
			}
		}
		UrlUtil.setUpProxy(properties.getProperty(Constants.PROP_PROXY));
		String hosts = properties.getProperty("http.nonProxyHosts");
		if (StringUtil.isEmpty(hosts) == false) {
			System.setProperty("http.nonProxyHosts", hosts);
		}
	}
}
