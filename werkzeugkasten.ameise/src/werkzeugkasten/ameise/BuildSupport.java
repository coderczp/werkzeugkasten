package werkzeugkasten.ameise;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public abstract class BuildSupport {

	public void all() throws Exception {

	}

	/**
	 * download from artifact from maven2 repository.
	 * 
	 * @param groupId
	 * @param artifactId
	 * @param version
	 */
	protected void depends(String groupId, String artifactId, String version) {

	}

	protected List<File> list(String root) {
		List<File> list = new ArrayList<File>();
		File f = new File(root);
		if (f.exists()) {
			add(f, list, NULL_FILTER);
		}
		return list;
	}

	protected void add(File root, List<File> list, FilenameFilter filter) {
		if (root == null) {
			return;
		}
		if (root.isDirectory()) {
			String[] ary = root.list();
			if (ary != null) {
				for (String s : ary) {
					add(new File(s), list, filter);
				}
			}

		} else if (root.exists()) {
			if (filter.accept(root.getParentFile(), root.getName())) {
				list.add(root);
			}
		}
	}

	protected List<File> list(String root, FilenameFilter filter) {
		return null;
	}

	public static final FilenameFilter NULL_FILTER = new FilenameFilter() {
		@Override
		public boolean accept(File dir, String name) {
			return true;
		}
	};

	protected FilenameFilter nameFilter(String pattern) {
		return new PatternFilter(pattern);
	}

}
