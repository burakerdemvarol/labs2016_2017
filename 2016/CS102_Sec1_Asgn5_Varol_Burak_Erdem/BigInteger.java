public class BigInteger implements Comparable {

	private int[] bigInt;
	private String newInput;
	public BigInteger(String input) {
		int i = 0;
		while (i < input.length()) {
			if (input.charAt(i) != '0') {
				i = input.length();
			} else {
				input = input.substring(i + 1);
			}
		}
		newInput = input;

		bigInt = new int[input.length()];
		for (int j = 0; j < input.length(); j++) {
			bigInt[j] = input.charAt(input.length() - j - 1) - '0';
		}
	}

	public int numberOfDigits() {
		return bigInt.length;
	}

	public int MID() {
		return getDigit(numberOfDigits() - 1);
	}

	public int LID() {
		return getDigit(0);
	}

	public int getDigit(int index) {
		return bigInt[index];
	}

	public String toString ()
    {
     return newInput;
    }
	@Override
	public int compareTo(Object o) {
		if(o instanceof BigInteger){
			BigInteger other = (BigInteger) o;
			if(other.numberOfDigits() > this.numberOfDigits()){
				return -1;
			}else if(other.numberOfDigits() < this.numberOfDigits()){
				return 1;
			}
			for(int i = this.numberOfDigits() - 1; i >= 0; i--){
				if(other.getDigit(i) > this.getDigit(i)){
					return -1;
				}
				else if(other.getDigit(i) < this.getDigit(i)){
					return 1;
				}
			}
			return 0;
		}
		return -1;
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof BigInteger){
			return compareTo(o) == 0;
		}else{
			return false;
		}
	}
}
