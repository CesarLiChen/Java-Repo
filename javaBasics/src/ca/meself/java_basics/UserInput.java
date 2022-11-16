package ca.meself.java_basics;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");		
		String input = sc.nextLine();		
		System.out.println("You typed: " + input);
		
		System.out.println("Now enter a number");
		int inputNum = sc.nextInt();
		System.out.println("This is your number: " + inputNum);
		
		System.out.println("Now enter a decimal number");
		double inputFloat = sc.nextDouble();
		System.out.println("This is your number: " + inputFloat);
	}
}
