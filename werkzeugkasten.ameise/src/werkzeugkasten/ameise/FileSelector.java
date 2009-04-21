package werkzeugkasten.ameise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileSelector {

	public interface Filter {
		boolean accept(String path);
	}

	public interface Handler {
		void handle(File file);
	}

	public static Filter NULL_FILTER = new Filter() {
		@Override
		public boolean accept(String path) {
			return true;
		}
	};

	public static class PatternFilter implements Filter {
		protected Pattern pattern;

		public PatternFilter(String pattern) {
			this.pattern = Pattern.compile(pattern);
		}

		public PatternFilter(Pattern pattern) {
			this.pattern = pattern;
		}

		@Override
		public boolean accept(String path) {
			return this.pattern.matcher(path).matches();
		}
	}

	public static class ReverseFilter implements Filter {
		protected Filter delegate;

		public ReverseFilter(Filter filter) {
			this.delegate = filter;
		}

		@Override
		public boolean accept(String path) {
			return this.delegate.accept(path) == false;
		}
	}

	public void list(String file, Filter filter, Handler handler) {
		File f = new File(file);
		if (f.isDirectory()) {
			String[] list = f.list();
			if (list != null) {
				for (String s : list) {
					if (filter.accept(s)) {
						list(s, filter, handler);
					}
				}
			}
		} else if (f.exists() && filter.accept(file)) {
			handler.handle(f);
		}
	}

	public List<File> list(String file, Filter filter) {
		final List<File> list = new ArrayList<File>();
		list(file, filter, new Handler() {
			@Override
			public void handle(File file) {
				list.add(file);
			}
		});
		return list;
	}
}
