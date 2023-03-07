package ca.meself.java_basics.class17.polymorphism;

public class Tree extends Plant {

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("tree growing");
	}
	
	public void shedding() { 
		System.out.println("tree leave's shedding");
	}
	
}
