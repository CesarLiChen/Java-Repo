package ca.meself.java_basics.class15.interfaces;

import ca.meself.java_basics.class15.interfaces.the_interface.Info;

public class App {
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}

	public static void main(String[] args) {
		
		Machine machine = new Machine(12);
		machine.start();
		machine.showInfo();
		
		System.out.println();
		
		Person p1 = new Person("Clark");
		p1.sayHi();
		p1.showInfo();
		
		System.out.println();
		
		Info info1 = new Machine(13);
		machine.start();
		info1.showInfo();
		
		Info m2 = new Machine(20);
		Info p2 = new Person("Bishop");
		
		outputInfo(m2);
		outputInfo(p2);
	}

}
