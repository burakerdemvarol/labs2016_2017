/**
 * @author king
 *
 */
public class LinkListDriver {
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList();
		
		System.out.println(list);
		System.out.println("Empty List : ");
		System.out.println(list.isEmpty());
		
		System.out.println("Get index: ");
		System.out.println(list.get(3));
		System.out.println("Empty List : ");
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		list.addToHead("a");
		list.addToHead("b");
		list.addToHead("c");
		list.addToHead("d");
		System.out.println("Added all");
		System.out.println(list);
		
		System.out.println("Removed : " + list.removeFromHead());
		System.out.println(list);
	}
}