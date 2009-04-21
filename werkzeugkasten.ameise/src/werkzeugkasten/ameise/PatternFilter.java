package werkzeugkasten.ameise;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class PatternFilter implements FilenameFilter {

	protected Pattern pattern;

	public PatternFilter(String pattern) {
		this(Pattern.compile(pattern, Pattern.CASE_INSENSITIVE));
	}

	public PatternFilter(Pattern pattern) {
		this.pattern = pattern;
	}

	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}

}
