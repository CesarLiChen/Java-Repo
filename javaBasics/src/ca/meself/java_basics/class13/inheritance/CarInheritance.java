package ca.meself.java_basics.class13.inheritance;

public class CarInheritance extends MachineInheritance{

	
	@Override
	public void start() {
		System.out.println("A car has started");
	}

	@Override
	public void stop() {
		System.out.println("A car has stopped");
	}

	public void horn() {
		System.out.println("Beep beep");
	}
	
	public void showInfo() {
		System.out.println("I'm a " + name);
	}
}
