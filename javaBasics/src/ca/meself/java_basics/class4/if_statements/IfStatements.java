package ca.meself.java_basics.class4.if_statements;
import java.util.Random;

public class IfStatements {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		// Random num from min to max
		int max = 5;
		int min = 1;		
		int rand = r.nextInt(max - min + 1) + min;
		
		System.out.println(rand);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(r.nextInt(7) + 4 +" ");		
		}
		
		boolean cond = 1 < 6;		
		if (cond) {
			System.out.println("IT PRINTED SO IT'S TRUE");
		} 
		
		int myInt = 20;
		if (myInt < 10) {
			System.out.println("Yes, it's smaller than 10");
		} else if (myInt > 10) {
			System.out.println("Ok, it's bigger than 10");						
		} else {
			System.out.println("I guess it is the same");
		}
		
		int loop = 0;
		while (true) {
			System.out.printf("looping: %d ==>", loop);			
			if (loop == 6) {
				break;
			}			
			loop++;
			System.out.println(" running");
		}
	}
}
