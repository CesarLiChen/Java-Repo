package ca.meself.java_basics;


class PersonExample {
	
	// Instance Variables (data or state)
	String name;
	int age;
	
	// Classes can contain:
	
	// 1. Data
	// 2. Subroutines (methods)
}
public class ClassesAndObjects {
	
	public static void main(String[] args) {
		
		PersonExample person1 = new PersonExample();
		person1.name = "Barry";
		person1.age  = 24;
		
		PersonExample person2 = new PersonExample();
		person2.name = "Iris";
		person2.age = 26;
		
		System.out.println(person1.name);
		System.out.println(person2.name);
	}
}
