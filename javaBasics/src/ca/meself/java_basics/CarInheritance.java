package ca.meself.java_basics;

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
}