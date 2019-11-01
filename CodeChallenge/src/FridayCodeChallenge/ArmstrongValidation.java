package FridayCodeChallenge;

public class ArmstrongValidation {
	private static int result = 0, rem;
	
	
	public static boolean isArmstrongNumber(int number) {
		int num = number;
		int len = String.valueOf(number).length();
		while(number >0) {
			rem = number % 10;
			result += Math.pow(rem, len);
			number = number / 10;
		}
		if(result == num) {
			return true;
		}
		else {
			return false;
		}
	}

}
