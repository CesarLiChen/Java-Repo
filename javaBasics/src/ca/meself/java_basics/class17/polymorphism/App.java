package ca.meself.java_basics.class17.polymorphism;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		Plant tree2 = new Tree();
		
		plant1.grow();
		plant2.grow();
		tree2.grow();
	}

}
