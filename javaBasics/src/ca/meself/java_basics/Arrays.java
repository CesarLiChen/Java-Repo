package ca.meself.java_basics;

public class Arrays {

	public static void main(String[] args) {

		int[] values = new int[3]; // Initialization

		int[] numArray = { 23, 12, 45, 67 };

		for (int i = 0; i < numArray.length; i++) {
			System.out.println("This is the value at index " + i + ": " + numArray[i]);
		}
		
		// Array of strings
		String[] words = new String[5];
		words[0] = "I";
		words[1] = "know";
		words[2] = "this";
		words[3] = "isn't";
		words[4] = "loveeee";
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		for (String word: words) {
			System.out.println(word + " [for each loop]");
		}
		
		// Multi-dimensional arrays
		
		int[][] grid = {
				{1, 2, 3},
				{7, 8, 9},
				{4, 5, 6}
		};
		
		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				System.out.print(grid[row][column] + " ");
			}
		}
		
		System.out.println();
		
		System.out.println(grid[2][2]); //6
		System.out.println(grid[0][1]); //2
		
		// String[][] name = new String[rows][columns]
		String[][] moreWords = new String[2][3];
		
		String[][] woords = new String[2][];
		woords[0] = {"AHHH", "RUUUN"};
		
	}

}
