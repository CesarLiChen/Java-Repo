package ca.meself.java_basics.class16.public_private_protected;

public class Modifiers {
	
	public static void main(String[] args) {
		System.out.println("Public 		\t=> access from anywhere (class, subclass, packages, etc");
		System.out.println("Private 	\t=> can only be accessed from the same class");
		System.out.println("Protected 	\t=> can only be accessed by subclasses and classes from same package.");
		System.out.println("No modifier	\t=> can only be accessed by classes from same package");
	}
}
