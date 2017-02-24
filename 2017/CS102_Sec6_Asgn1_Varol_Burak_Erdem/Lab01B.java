/*******************************************************
 * /* CS102 Lab1 - Burak Erdem Varol - (2017/02/19) Description: B Part * /
 *******************************************************/
public class Lab01B {
	public static void main(String[] args) {
		IntBag room;
		room = new IntBag();// object of an IntBag class
		int count = 0;
		int i = 2;// initialized variables
		do {
			if (isPrime(i))// checks whether a number is prime or not
			{
				room.add(i);
				count++;
			}
			i++;
		} while (count != 100);
		System.out.println(room.toString());// Shows collection of an first 100
											// prime number
		System.out.println(primeNumbersIndexed(5, 17, room));
	}// main

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static IntBag primeNumbersIndexed(int firstIndex, int endIndex, IntBag bags) {
		IntBag temp = new IntBag();
		for (int x = firstIndex; x < endIndex; x++) {
			if (isPrime(bags.get(x))) {
				temp.add(bags.get(x));
			}
		}
		return temp;
	}
}