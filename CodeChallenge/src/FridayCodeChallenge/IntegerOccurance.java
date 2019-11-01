package FridayCodeChallenge;

import java.util.Arrays;

public class IntegerOccurance {
	
	public static void getOccurance(int[] array) {
		
		Arrays.sort(array);
	
		int count, tempCount, number, tempNumber;
		
		count = 0;
		tempCount = 0;
		number = array[0];
		tempNumber = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(tempNumber == array[i]) {
				tempCount++;
			
			}
			else {
				if(tempCount > count) {
					count = tempCount;
					number = tempNumber;
				}
				tempCount = 1;
				tempNumber = array[i];	
			}		
		}
		if(tempCount > count) {
			count = tempCount;
			number = tempNumber;
		}
		String string = "Number " + number + " occured the most, " + count + " times";
		System.out.println(string);
	}
}
