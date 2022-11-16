package ca.meself.java_basics;

public class ForLoops {
	
	public static void main(String[] args) {
		
		// Normal for-loop
		for (int i=1; i <= 10; i++) {
			System.out.println("Printing HELOOooo: " + i + " times");			
		}
		
		// Infinite for-loop, you can uncomment to try it:
//		for(;;) {
//			System.out.println("to infinity!!");
//		}
		
		// String formatting
		int testInt = 24124;
		System.out.printf("String formatting by using an integer %d.\n", testInt);
		
		for (int i=0; i < 5; i++) {
			System.out.printf("For-loop and formatting for %d times\n", i);
		}
	}
}
