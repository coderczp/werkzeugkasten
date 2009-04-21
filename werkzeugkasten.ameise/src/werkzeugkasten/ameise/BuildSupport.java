package werkzeugkasten.ameise;

import java.io.File;
import java.util.List;

public abstract class BuildSupport {

	protected FileSelector fileSelector = new FileSelector();

	protected static FileSelector.Filter FILTER_DEFAULT_IGNORED = new FileSelector.ReverseFilter(
			new FileSelector.PatternFilter(
					"^(\\..*|CVS|SCCS|[Vv][Ss][Ss][Vv][Ee][Rr]\\.[Ss][Cc][Cc]|.*(\\.([Bb][Aa]?[Kk]|[Tt][Mm][Pp]|[Oo][Rr][Ii]?[Gg])|~))$"));

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

	/**
	 * list files with default ignored filter
	 * 
	 * @param path
	 *            listing directory or file
	 * @return files
	 */
	protected List<File> list(String path) {
		return fileSelector.list(path, FILTER_DEFAULT_IGNORED);
	}

	/**
	 * list files with filter
	 * 
	 * @param path
	 *            listing directory or file
	 * @param filter
	 * @return files
	 */
	protected List<File> list(String path, FileSelector.Filter filter) {
		return this.fileSelector.list(path, filter);
	}

	protected void zip(String dest, String root) {

	}
}
