package ca.meself.java_basics.class15.interfaces;

import ca.meself.java_basics.class15.interfaces.the_interface.Info;

public class Machine implements Info{
	
	private int id;
	
	public Machine(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Machine started");
	}
	
	public void stop() {
		System.out.println("Machine stopped");
	}

	@Override
	public void showInfo() {
		
		System.out.println("SHOWING INFO [MACHINE] -- ID: " + id);
	}
}
