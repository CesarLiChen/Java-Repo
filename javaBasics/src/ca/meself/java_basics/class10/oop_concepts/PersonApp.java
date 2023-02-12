package ca.meself.java_basics.class10.oop_concepts;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person pDefault = new Person();
		Person p2 = new Person("Matt", 30);
//		p1.name = "Clark";
//		p1.age = 24;
		
		p1.setName("Clark");
		p1.setAge(24);
		
		int age = p1.getAge();
		String name = p1.getName();
		
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		
		p1.speak();
		
		int yearsToRetirement = p1.calcYearsToRetirement();		
		System.out.println(yearsToRetirement + " years left for " + name + " to retire.");
		
		p1.useSpell("wingardium leviosa");
		
		System.out.println(pDefault.getName());
		System.out.println(p2.getName());
		
		System.out.println(p1.getTotalPeople());
		System.out.println(Person.message);
	}
}
