import java.util.*;
public class BigIntegerList {
	
	private ArrayList<BigInteger> numbers;
	
	public BigIntegerList(ArrayList<String> bigIntList){
		
		numbers = new ArrayList<BigInteger>();
		
		for(int i = 0; i < bigIntList.size(); i++){
			BigInteger temp = new BigInteger(bigIntList.get(i));
			numbers.add(temp);
		}
	}
	
	public int getSize(){
		return numbers.size();
	}
	
	public BigInteger getBigIntegerAt(int index){
		return numbers.get(index);
	}
	
	public void setBigIntegerAt(int index, BigInteger bigInt){
		numbers.set(index, bigInt);
	}
	
	public void addBigInteger(String number){
		BigInteger temp = new BigInteger(number);
		numbers.add(temp);
	}
	
	public void removeBigInteger(int index){
		numbers.remove(index);
	}
	
	public void removeBigInteger(BigInteger bigInt){
		numbers.remove(bigInt);
	}

	public BigInteger min(int start, int end) {
		BigInteger min = numbers.get(start);
			
		for(int i = start+1; i <= end; i++){
			if(min.compareTo(numbers.get(i)) == 1 ){
	        	min = numbers.get(i);
			}
		}
		return min;
	   	}
}	

