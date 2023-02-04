package ca.meself.java_basics;

public class Arrays {

	public static void main(String[] args) {
		
		int[] values = new int[3]; // Initialization		
		
		
		int[] numArray = {23, 12, 45, 67};
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println("This is the value at index " + i + ": " + numArray[i]);
		}
	}

}
