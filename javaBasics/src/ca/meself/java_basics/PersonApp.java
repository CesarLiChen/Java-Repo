package ca.meself.java_basics;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Clark";
		p1.age = 24;
		
		p1.speak();
		
		int yearsToRetirement = p1.calcYearsToRetirement();		
		System.out.println(yearsToRetirement + " years left for " + p1.name + " to retire.");
		
		int age = p1.getAge();
		String name = p1.getName();
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	}
}
