package ca.meself.java_basics.class9.classes_objects_methods;


class PersonExample {
	
	// Instance Variables (data or state)
	String name;
	int age;
	
	// Classes can contain:
	
	// 1. Data
	// 2. Subroutines (methods)
	
	void speak() {
		System.out.println("Hi! My name is " + name);
	}
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
		
		person1.speak();
		person2.speak();
	}
}
