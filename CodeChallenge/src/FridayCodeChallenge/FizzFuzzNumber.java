package FridayCodeChallenge;

public class FizzFuzzNumber {
	
	public static void isFizzFuzz(int number) {
		
		if((number % 3 == 0 ) && (number % 5 == 0)) {
			System.out.println("FizzFuzz");
		}
		else if(number % 3 == 0) {
			System.out.println("Fizz");
		}
		else if(number % 5 == 0) {
			System.out.println("Fuzz");
		}
		else {
			System.out.println(number);
		}
		
	}

}
