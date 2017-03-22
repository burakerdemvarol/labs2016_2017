/** IntBagIterator.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * It overrides normal Iterator class in java library 
  */
import java.util.Iterator;

public class IntBagIterator implements Iterator {

	IntBag bag;
	int index;

	public IntBagIterator(IntBag bag) {
		this.bag = bag;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bag.size() ) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		return bag.get(index++);
	}

}
