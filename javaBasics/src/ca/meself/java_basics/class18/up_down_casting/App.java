package ca.meself.java_basics.class18.up_down_casting;

public class App {
	public static void main(String[] args) {
		
		Machine m1 = new Machine();
		Camera cam1 = new Camera();
		
		m1.start();
		cam1.start();
		cam1.snap();
		
		// Upcasting
		Machine m2 = new Camera();
		m2.start();
		
		//m2.snap(); doesn't work
		
		// Downcasting
		Machine m3 = new Camera();
		Camera cam2 = (Camera)m3;
		
		// Doesn't work
		Machine m4 = new Machine();
		// Camera cam3 = (Camera)m4
	}
}
