package ca.meself.java_basics.class7.switch_case;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please ener a command: ");
		String text = sc.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine started");
			break;
			
		case "stop":
			System.out.println("Machine stopped");
			break;

		default:
			System.out.println("Command entered not recognized");
		}
	}
}
