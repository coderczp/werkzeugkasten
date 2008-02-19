package werkzeugkasten.mvnhack.repository.impl;

import java.io.File;
import java.net.URL;

import werkzeugkasten.mvnhack.repository.Artifact;
import werkzeugkasten.mvnhack.repository.Context;
import werkzeugkasten.mvnhack.repository.Destination;
import werkzeugkasten.mvnhack.repository.Repository;

public class FlatDestination implements Destination, DestinationUtil.Handler {

	protected static final Filter DEFAULT_FILTER = new Filter() {
		public boolean filter(String path) {
			return path.endsWith("jar") || path.endsWith("zip");
		}
	};

	protected File dest;

	protected Filter filter;

	public FlatDestination(File dir) {
		this(dir, DEFAULT_FILTER);
	}

	public FlatDestination(File dir, Filter filter) {
		this.dest = dir;
		this.filter = filter;
	}

	@Override
	public void copyFrom(Context context, Repository repository,
			Artifact artifact) {
		DestinationUtil.copy(context, repository, artifact, this);
	}

	@Override
	public File toDestination(URL url) {
		String path = url.getPath();
		path = path.substring(path.lastIndexOf('/') + 1);
		if (this.filter.filter(path)) {
			return new File(dest, path);
		}
		return null;
	}

	public interface Filter {
		boolean filter(String path);
	}
}
