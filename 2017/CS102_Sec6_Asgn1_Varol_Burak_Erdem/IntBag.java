/*******************************************************
 * /* CS102 Lab1 - Burak Erdem Varol - (2017/02/19) Description: IntBag class
 * creating and methods defining * /
 *******************************************************/
public class IntBag {

	private int[] bag;
	private int endPos;

	public IntBag() {
		bag = new int[100];
		bag[0] = -1;
		endPos = 0;
	}

	public IntBag(int x) {
		bag = new int[x];
		bag[0] = -1;
		endPos = 0;
	}

	public void add(int value) {// add values to the array
		if (endPos + 1 == bag.length) {
			resize();
		}
		bag[endPos] = value;
		bag[++endPos] = -1;
	}

	public void add2(int value, int t) {// add value to a given index
		if (t > endPos) {
			System.out.println("Invalid position: " + t);
			return;
		}
		else if (endPos + 1 == bag.length) {
			resize();
		}
		for (int i = endPos; i > t; i--) {
			bag[i] = bag[i - 1];
		}
		bag[t] = value;
		bag[++endPos] = -1;
	}

	public void remove(int i) {// removes an index
		if (i > endPos - 1 && i < 0) {
			System.out.println("Invalid position: " + i);
			return;
		}
		endPos = endPos - 1;
		while (i < bag.length - 1) {
			bag[i] = bag[++i];
			bag[endPos + 1] = -1;
		}
		// endPos = endPos-1;
	}

	public boolean contains(int val) {// checks whether value exists
		for (int i = 0; i < endPos; i++) {
			if (bag[i] == val) {
				return true;
			}
		}
		return false;
	}

	public boolean empty() {// checks whether array is empty or not
		return endPos == 0;
	}

	public int get(int pos) {// Getter
		if (pos < 0 || pos >= endPos) {
			System.out.println("Invalid position: " + pos);
		}
		return bag[pos];
	}

	public void findAllAndRemove(int value) { // finds indexes of an given value
		for (int i = 0; i < endPos; i++) {
			if (bag[i] == value) {
				remove(i);
			}
		}
	}

	public IntBag findAll(int val) { // finds indexes of an given value
		IntBag indexStr = new IntBag();
		for (int i = 0; i < endPos; i++) {
			if (bag[i] == val) {
				indexStr.add(i);
			}
		}
		return indexStr;
	}

	public String toString() { // toString method
		String result = "";
		for (int i = 0; i < endPos; i++) {
			result += " " + bag[i];
		}
		return result;
	}

	private void resize() {
		int[] temp;
		temp = new int[endPos * 2];

		for (int i = 0; i < endPos; i++) {
			temp[i] = bag[i];
		}
		bag = temp;
	}

}
