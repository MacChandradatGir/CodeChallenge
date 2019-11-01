//
package FridayCodeChallenge;

public class PalindromeValidation {
	
	//This method is to check if a String is palindrome
	//And return true if it is or false if not
	
	public static boolean isPalindrome(String string) {
		String reverseString="";
		
		//Create a reverse string of characters
		for(int i = string.length()-1;i >=0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		//Check if the two Strings are equal
		if(reverseString.equals(string)) {
			return true;
		}
		else {
			return false;
		}	
	}
}
