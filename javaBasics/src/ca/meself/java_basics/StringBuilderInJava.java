package ca.meself.java_basics;

public class StringBuilderInJava {
	
	public static void main(String[] args) {
		
		// Inefficient, recreates string everytime.
		String info = "";
		
		info += "Hi, my name is John.";
		info += " ";
		info += "John Constantine.";
		
		System.out.println(info);
		
		// More efficient.
		StringBuilder sb = new StringBuilder();
		sb.append("My name is Barry Allen,");
		sb.append(" ");
		sb.append("and I'm the fastest man alive");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("Who doesn't")
		.append(" ")
		.append("pineapple and pizza");
		
		System.out.println(s.toString());
		
		/*
		 * String formatting.
		 */
		
		System.out.printf("Their name is %s\n", "forever gone.");
		System.out.printf("Total cost %d; quantity is %d\n", 5, 120);
		System.out.printf("%%f is for floating points: %f\n", 6.123);
		System.out.printf("%%f is for floating points: %.2f\n", 6.123);
		
		for (int i = 5; i < 11; i++) {
			System.out.printf("%2d, another one down\n", i);
		}
	}
}
