package FridayCodeChallenge;

//This is a Singleton class
public class MyPrintSpool {
	
	//Declared single object of the class
	private static MyPrintSpool myPrintSpool;
	
	//private constructor of the class
	private MyPrintSpool() {}
	
	//Method to instantiate a single object of the class
	public static MyPrintSpool getInstant() {
		if(myPrintSpool == null) {
			myPrintSpool = new MyPrintSpool();
		}
		return myPrintSpool;
	}
	

}
