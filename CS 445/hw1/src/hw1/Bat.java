package hw1;

public class Bat extends Creature implements Flyer{
	
	//Constructor
	public Bat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	//Method
	public void eat(Thing aThing) {
		
	}

	public void move() {
		this.fly();
	}
	
	public void fly() {
		System.out.println(this.toString() + " is swooping through the dark.");
	}
	
	
	
	
}
