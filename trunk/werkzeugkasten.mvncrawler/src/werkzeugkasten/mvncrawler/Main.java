package werkzeugkasten.mvncrawler;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public Main() {
	}

	public void execute() {
		String topUrl = "http://repo1.maven.org/maven2/";
		Waiter waiter = new Waiter();
		try {
			waiter.begin();
			CrawlerContext c = new CrawlerContext(topUrl, waiter);
			c.crawlmore(topUrl);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			waiter.finish();
		}
	}

}