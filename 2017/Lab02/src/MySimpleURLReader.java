import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader {

	private String url;

	public MySimpleURLReader(String url) {
		super(url);
		this.url = url;
	}

	public String getName() {
		int substringPoint = 0;
		for (int i = 0; i < url.length(); i++) {
			if (url.charAt(i) == '/') {
				substringPoint = i+1;
			}
		}
		return url.substring(substringPoint);
	}

	public String getPageContents() {
		return super.getPageContents().substring(4);
	}

	public static void main(String[] args) {
		MySimpleURLReader test = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt");
		
		System.out.println("This is url name: " + test.getName());
		System.out.println("This is correct content: " + test.getPageContents());

	}

}
