
public class HTMLFilteredReader extends MySimpleURLReader {
	private String url;

	public HTMLFilteredReader(String url) {
		super(url);
		this.url = url;
	}
	public String getUnfilteredPageContents(){
		return getPageContents();
	}

//	public String getFilteredPageContents() {
//		int firstPoint = 0;
//		int lastPoint = 0;
//		String filtered = "";
//		for (int i = 0; i < getPageContents().length(); i++) {
//			if (getPageContents().charAt(i) == '<') {
//				firstPoint = i;
//			}
//			if (getPageContents().charAt(i) == '>') {
//				lastPoint = i;
//			}
//			filtered += getPageContents().substring(firstPoint, lastPoint);
//		}
//		return filtered;
//	}

//	 it is a one line code solution for filtered method
	 public String getFilteredPageContents() {
	 return getPageContents().replaceAll("\\<[^>]*>", "");
	 }

	public static void main(String[] args) {
		HTMLFilteredReader test = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/housman.htm");
		System.out.println(test.getFilteredPageContents());

	}

}
