package FridayCodeChallenge;

public class ChallengeTest {

	public static void main(String[] args) {
		//redivider, deified, civic, radar,
		String string = "redivider";
		System.out.println();
		boolean isPal = PalindromeValidation.isPalindrome(string);
		System.out.println(string + " is palindrome: " + isPal);
		System.out.println();

		MyPrintSpool printSpool1 =  MyPrintSpool.getInstant();
		MyPrintSpool printSpool2 =  MyPrintSpool.getInstant();
		System.out.println();
		System.out.println("Is printSpool1 == printSpool2 ? " + (printSpool1 == printSpool2));
		System.out.println("printSpool1 System identity hashcode: " + System.identityHashCode(printSpool1));
		System.out.println("printSpool2 System identity hashcode: " + System.identityHashCode(printSpool2));
		System.out.println();
		
	    int[] array = {2,3,4,5,5,6,7};
	    IntegerOccurance.getOccurance(array);
	    System.out.println();
	    
	    FizzFuzzNumber.isFizzFuzz(15);
	    FizzFuzzNumber.isFizzFuzz(9);
	    FizzFuzzNumber.isFizzFuzz(10);
	    FizzFuzzNumber.isFizzFuzz(23);
	    System.out.println();
	    int number = 6;
	    System.out.println(number + " is an Armstrong number: " + ArmstrongValidation.isArmstrongNumber(number));
	    
	    
	
	
	}

}
