package ca.meself.java_basics;

// Class used for OOP concepts

public class Person {
	
	public String name;
	public int age;
	
	public void speak() {
		System.out.println("My name is " + name + "!");
	}
	
	public int calcYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
