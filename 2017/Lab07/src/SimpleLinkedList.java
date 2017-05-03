/**
 * @author king
 *
 */
public class SimpleLinkedList {
	Node first;

	/**
	 * Constructor
	 */
	public SimpleLinkedList() {
		first = null;
	}

	/**
	 * Adding to head item
	 * @param item
	 */
	public void addToHead(String item) {
		Node temp = new Node();
		temp.item = item;

		if (first == null) {
			temp.next = first;
			first = temp;
		} else {
			temp.next = first;
			first = temp;
		}
	}

	/**
	 * Removing node from head
	 * @return String
	 */
	public String removeFromHead() {
		if (first != null) {
			String value = first.item;
			first = first.next;
			return value;
		} else
			return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String res = "";
		if (first == null)
			System.out.println("List is empty");
		else {

			Node current = first;
			while (current != null) {
				res += current.item + " ";
				current = current.next;
			}
		}
		return res;
	}
	
	/**
	 * Extra Work 
	 * @param str
	 * @param azz
	 * @return
	 */
	public SimpleLinkedList preFix(String str, SimpleLinkedList azz){
		SimpleLinkedList arr = new SimpleLinkedList();
		Node current = first;
		while (current != null) {
			if(current.item.startsWith(str)){
				arr.addToHead(current.item);
			}
			current = current.next;
		}
		return arr;
	}

	/**
	 * isEmpty method
	 * @return
	 */
	public boolean isEmpty() {
		return (first == null);
	}

	/**
	 * get method: getting item from specific index
	 * @param index
	 * @return
	 */
	public String get(int index) {
		int count = 0;
		Node current = first;
		while (current != null) {
			count++;
			current = current.next;
		}
		current = first;
		if (index < 0 || index >= count) {
			return null;
		} else {
			for (int i = 0; i <= index - 1; i++) {
				current = current.next;
			}
			return current.item;
		}
	}
}