package ca.meself.java_basics;

// Class used for OOP concepts

public class Person {
	
	private String name;
	private int age;
	
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
