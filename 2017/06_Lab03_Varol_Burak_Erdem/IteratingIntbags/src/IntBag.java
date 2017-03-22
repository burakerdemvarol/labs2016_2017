/** IntBag.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * It comes from Lab01
  */
import java.util.Iterator;

public class IntBag {

	private int valid;
	private int[] bag;

	/*
	 * This constructor creates an empty array which has up to 100 rooms
	 */
	public IntBag() {
		bag = new int[100];
		valid = 0;
	}

	/*
	 * This constructor creater an empty array which has up to specified number
	 * of rooms
	 */
	public IntBag(int x) {
		bag = new int[x];
		valid = 0;
	}

	/*
	 * This is copy constructor
	 */

	public IntBag(IntBag newone) {
		this.valid = newone.valid;

		for (int x = 0; x < this.bag.length; x++) {
			newone.bag[x] = this.bag[x];
		}
	}

	/*
	 * This method adds a value at the end of the array
	 * 
	 * @int x Taken value
	 */
	public void add(int k) {
		if (valid == bag.length) {
			System.out.println("Maybe next Time");
		} else {
			bag[valid] = k;
			valid = valid + 1;

		}
	}

	/*
	 * This method adds a value in the specified index
	 * 
	 * @int k taken value, @ int index specified index
	 */
	public void add(int value, int index) {
		if (index <= bag.length && valid - 1 <= bag.length) {
			for (int k = valid; k >= index; k--) {

				bag[k] = bag[k - 1];
			}

			valid = valid + 1;
			bag[index - 1] = value;

		} else {
			System.out.println("out of bounds");
		}
	}

	/*
	 * This method removes an element which lies on the specified index
	 * 
	 * @param int index shows specified index number
	 */

	public void remove(int index) {
		if (index > valid - 1 && valid < 0) {
			System.out.println("Mistake");
			return;
		}

		valid = valid - 1;
		for (int k = index - 1; k < bag.length - 1; k++) {
			bag[k] = bag[k + 1];
		}
	}

	/*
	 * This method controls that given value in the bag or not
	 * 
	 * @param givenValue searched value
	 * 
	 * @returns whether the value in the bag or not
	 */
	public Boolean contains(int givenValue) {
		boolean found = false;

		for (int x = 0; x < bag.length; x++) {
			if (bag[x] == givenValue) {
				found = true;
			}
		}
		return found;
	}

	/*
	 * This method writes all element in the bag
	 */
	public String toString() {
		String allValues = "";

		for (int x = 0; x < valid; x++) {
			allValues = allValues + bag[x] + " ";
		}

		return allValues;
	}

	/*
	 * This method shows the size of the bag
	 * 
	 * @returns valid
	 */
	public int size() {
		return valid;
	}

	/*
	 * This method shows the value which lies in the specified index
	 * 
	 * @return bag[index]
	 */
	public int get(int index) {
		return bag[index];
	}

	/*
	 * Returns the location of an index
	 * 
	 * @param value Searched value
	 * 
	 * @returns location of the specified value
	 */
	public IntBag findAll(int value) {
		IntBag locations = new IntBag();

		for (int x = 1; x <= valid; x++) {
			if (bag[x - 1] == value) {

				locations.add(x);
			}
		}
		return locations;
	}

	/*
	 * Iterator method which is used for using iterator
	 * 
	 * @param no parameter
	 * 
	 * @returns Iterator object
	 */
	public Iterator iterator() {
		Iterator i = new IntBagIterator(this);
		return i;

	}
}