package ca.meself.java_basics.class12.to_string_method;

class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
//		return "I'm what toString calls!!";
//		return "I'm " + name + " with id " + id;
		
		StringBuilder sb = new StringBuilder();
		sb.append("I'm ").append(name).append(" with id ").append(id);
		return sb.toString();
	}
}

public class TheToStringMethod {

	public static void main(String[] args) {
		
		Frog f = new Frog(12345, "Naruto");
		
		/*
		 * If toString is stated in the class:
		 * if will print whatever it returns.
		 * Else:
		 * it prints the hashCode for the object.
		 */
		System.out.println(f);
	}

}
