package ca.meself.java_basics;

public class StringBuilder {
	
	public static void main(String[] args) {
		
		// Inefficient
		String info = "";
		
		info += "Hi, my name is John.";
		info += " ";
		info += "John Constantine.";
		
		System.out.println(info);
	}
}
