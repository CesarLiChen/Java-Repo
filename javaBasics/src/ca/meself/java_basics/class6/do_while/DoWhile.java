package ca.meself.java_basics.class6.do_while;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Enter a value");
		int val = sc.nextInt();
		
		while (val != 5) {
			System.out.println("I don't like that number, again please");
			val = sc.nextInt();
		}
		System.out.println("That's it, thank you");
		*/
		
		int val = 0;
		do {
			System.out.println("Enter a number, please: ");
			val = sc.nextInt();
		}
		while(val != 5);
	}
}
