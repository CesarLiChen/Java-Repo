package ca.meself.java_basics.class2.while_loops;

public class WhileLoops {
	
	public static void main(String[] args) {		
		int END = 5;
		int count = 0;
		
		while (count <= END) {
			System.out.println("I'm in this " + count + " level of drunkness");
			count += 1;
		}
	}
}
