package ca.meself.java_basics;

public class MachineApp {
	
	public static void main(String[] args) {
		
		MachineInheritance machine = new MachineInheritance();		
		machine.start();
		machine.stop();
		
		CarInheritance car = new CarInheritance();
		car.start();
		car.horn();
		car.showInfo();
		car.stop();
	}
}
