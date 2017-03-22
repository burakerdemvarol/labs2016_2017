/** Testing.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * Testing IntBagIterator.
  */
import java.util.Iterator;

public class Testing {
	public static void main(String[] args) {

		Iterator i, j;
		IntBag bag = new IntBag(12);

		i = new IntBagIterator(bag);

		bag.add(4);
		bag.add(2);
		bag.add(213);
		bag.add(34);
		bag.add(56);
		bag.add(7);
		bag.add(34);

		while (i.hasNext()) {
			System.out.println(i.next());

			j = new IntBagIterator(bag);
			// j = bag.iterator();

			while (j.hasNext()) {
				System.out.println("--" + j.next());
			}
		}
	}
}
