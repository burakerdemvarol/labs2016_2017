import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BigIntegerTester {
	public static boolean testBigInteger(BigInteger bigInt,int expectedLID, int expectedMID, int expectedSecondDigit){
		boolean LIDWorks = expectedLID == bigInt.LID();
		boolean MIDWorks = expectedMID == bigInt.MID();
		boolean secondDigitWorks = expectedSecondDigit == bigInt.getDigit(1);
		return LIDWorks && MIDWorks && secondDigitWorks;
	}
	
	public static BigIntegerList getBigIntegersFromFile (String fileName) {
    
    ArrayList<String> bigIntListStr = new ArrayList<String>();
    File file = new File(fileName);

    try {

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String bigIntStr = sc.nextLine();
            bigIntListStr.add(bigIntStr);
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
	BigIntegerList bigIntList = new BigIntegerList(bigIntListStr);
   	return bigIntList;
	
  }

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		//  String fileName = "BigNumbers1.txt";
		//	String fileName2 = "BigNumbers2.txt";
		//	String fileName3 = "BigNumbers3.txt";

		System.out.print("Please enter the filename: ");
		String fileName = scan.next();
  
		System.out.println("Output:");
	     
		BigIntegerList bigInt = getBigIntegersFromFile(fileName);
	
		System.out.println("start index: " + 0);
		System.out.println("middle index: " + ((bigInt.getSize() - 1) / 2));
		System.out.println("end index: " + (bigInt.getSize()-1));
		
		
		System.out.println("Minimum of all the numbers: ");
		System.out.println(bigInt.min(0, bigInt.getSize()-1));
		
		System.out.println("Minimum of the first half: ");
		System.out.println(bigInt.min(0, ((bigInt.getSize() - 1) / 2)));
		
		System.out.println("Minimum of the second half: ");
		System.out.println(bigInt.min(((bigInt.getSize() - 1) / 2), (bigInt.getSize()-1))); 
		

//		BigInteger bigInt = new BigInteger("1024");
//		BigInteger bigInt1 = new BigInteger("0001234");
//		System.out.println("1024 equals 0001234: " + bigInt.equals(bigInt1));
//		System.out.println("1024 compareTo 0001234: " + bigInt.compareTo(bigInt1));
//		System.out.println("Test '1024': " + testBigInteger(bigInt,4,1,2));
//		System.out.println("Test '0001234': " + testBigInteger(bigInt1,4,1,3));
//		System.out.println("LID: " + bigInt.LID() );
//		System.out.println("MID: " + bigInt.MID());
//		System.out.println("Second Digit: " + bigInt.getDigit(1));
	}

}