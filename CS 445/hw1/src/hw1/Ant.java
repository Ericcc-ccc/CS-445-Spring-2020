package hw1;

public class Ant extends Creature {

	//Constructor
	public Ant(String name) {
		super(name);
	}
	
	public void move() {	
		// name = this.toString | Class Name = this.getClass().getSimpleName()
		String output = String.format("%s is crawling around.",this.toString());
		System.out.println(output);
	}

}
