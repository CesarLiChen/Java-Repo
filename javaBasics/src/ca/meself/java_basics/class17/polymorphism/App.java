package ca.meself.java_basics.class17.polymorphism;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plant plant1 = new Plant();
		
		Tree tree = new Tree();		
		Plant plant2 = tree;
		
		Plant tree2 = new Tree();
		
		plant1.grow();
		plant1.whoAmI();
		// plant1.shedding(); //throws error because there is no such method
		
		plant2.grow();
		plant2.whoAmI();
		// plant2.shedding(); //doesn't work
		
		tree.shedding();
		
		tree2.grow();
		tree2.whoAmI();
		// tree2.shedding(); //doesn't work
	}

}
