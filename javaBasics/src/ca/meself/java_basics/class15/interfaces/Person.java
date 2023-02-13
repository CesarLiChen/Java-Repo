package ca.meself.java_basics.class15.interfaces;

import ca.meself.java_basics.class15.interfaces.the_interface.Info;

public class Person implements Info{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHi() {
		System.out.println("Hi, my name is " + name);
	}
	
	@Override
	public void showInfo() {
		
		System.out.println("SHOWING INFO [PERSON] -- Name: " + name);
	}
}
