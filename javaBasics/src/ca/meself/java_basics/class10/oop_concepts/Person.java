package ca.meself.java_basics.class10.oop_concepts;

// Class used for OOP concepts
// From 21 (Setters and "this" to 23 (Static and final)

public class Person {
	
	public final static int YEAR_OF_BIRTH = 1997;
	private String name;
	private int age;
	private static int totalPeople;
	public static String message = "This is the 'Person' class";
	
	public Person() {
		// this(John, 35)  //HAS to be first line.
		System.out.println("Normal constructor running");
		name = "John";
		age = 35;
		
		totalPeople++;
	}
	
	public Person(String name) {
		System.out.println("Overloaded constructor running");
		this.name = name;
		
		totalPeople++;
	}
	
	public Person(String name, int age) {
		System.out.println("Second overloaded constructor running");
		this.name = name;
		this.age = age;
		
		totalPeople++;
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
	
	public int getTotalPeople() {
		return totalPeople;
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
