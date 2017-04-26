import java.util.ArrayList;

/**
 * @author king
 *
 */
public class Methods {
	
	char letter = 'e';
	/**
	 * counts the number of occurrences of the character "e" in a string.
	 * @param s
	 * @param letter
	 * @return
	 */
	public static int occurunces(String s, char letter){
		if(s.length() == 0){
			return 0;
		}
		int count = 0;
		if(s.charAt(0) == letter){
				count++;
		}
		return count + occurunces(s.substring(1), letter);
	}
	
	/**
	 * decimal to binary method
	 * @param value
	 */
	public static void toBinary(int value){
		if(value > 0){
			toBinary(value/2);
			System.out.print(value%2);
		}
	}
	
	/**
	 * binary to decimal method
	 * @param values
	 * @return integer
	 */
	public static int binaryToDecimal(String values) {
	    int size = values.length();
	    if (size == 1) {
	        return Integer.parseInt(values);
	    } else {
	        return binaryToDecimal(values.substring(1, size)) + Integer.parseInt(values.substring(0, 1)) * (int) Math.pow(2, size - 1);
	    }
	}
	
	static int index = 0;
	/**
	 * effectively alphabetic order checker
	 * @param list
	 * @return boolean
	 */
	public static boolean lexicographic(ArrayList<String> list){
		if(list.size() <= 1){
			return true;
		}
		else if(list.get(0).compareTo(list.get(1)) <= 0){
			list.remove(0);
			return lexicographic(list); 
		}
		return false;
	}

	/**
	 * checker method for order
	 * @param str
	 * @return boolean
	 */
	public static boolean checker(String str){
		if(str.length() <= 1)
			return true;
		if((int)str.charAt(0) < (int)str.charAt(1))
			return checker(str.substring(1));
		else return false;
	}
	
	/**
	 * enumarates method computing numbers with order
	 * @param n
	 * @param curr
	 */
	public static void enumarates(int n,int curr){
		int end = (int) Math.pow(10, n);
		
		if(curr < end){
			if(checker(curr + "") == true){
				System.out.print(curr + " ");
			}
			enumarates(n,curr+2);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("abd");
		list2.add("aba");
		i = occurunces("askdjlkanfm,nzxe,nflkejasdeeee", 'e');
		System.out.println(i);
		toBinary(23);
		System.out.println();
		int n = 3;
		int beg =  (int) Math.pow(10, n-1);
		enumarates(n, beg);
		System.out.println();
		System.out.println(lexicographic(list2));
		System.out.println(binaryToDecimal("100010"));
	}

}
