package ca.meself.java_basics;

// Class used for OOP concepts

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		// this(John, 35)  //HAS to be first line.
		System.out.println("Normal constructor running");
		name = "John";
		age = 35;
	}
	
	public Person(String name) {
		System.out.println("Overloaded constructor running");
		this.name = name;
	}
	
	public Person(String name, int age) {
		System.out.println("Second overloaded constructor running");
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("My name is " + name + "!");
	}
	
	public void useSpell(String spell) {
		System.out.println("**waves wand** " + spell.toUpperCase() + "!!!");
	}
	
	public int calcYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
}
