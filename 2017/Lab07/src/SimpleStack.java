/**
 * @author king
 *
 */
public class SimpleStack {
	SimpleLinkedList list;
	
	public SimpleStack(){
		list = new SimpleLinkedList();
	}
	
	/**
	 * push method
	 * @param str
	 */
	public void push(String str){
		list.addToHead(str);
	}
	/**
	 * pop method
	 * @return removeFromHead()
	 */
	public String pop(){
		return list.removeFromHead();
	}
	/**
	 * is empty method
	 * @return isEmpty()
	 */
	public boolean isEmpty(){
		return list.isEmpty();
	}
}