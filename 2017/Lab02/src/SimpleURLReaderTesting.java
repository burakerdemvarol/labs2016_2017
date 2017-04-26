import cs1.SimpleURLReader;

public class SimpleURLReaderTesting extends SimpleURLReader {

	private String url;

	public SimpleURLReaderTesting(String url) {
		super(url);
		this.url = url;
	}
	
	public String getURL(){
		return url;
	}

	public static void main(String[] args) {
		SimpleURLReaderTesting test = new SimpleURLReaderTesting("http://www.cs.bilkent.edu.tr/~david/housman.txt");
		System.out.println(test.getPageContents());
		System.out.println("This url has " + test.getLineCount() + " lines.");
	}

}
