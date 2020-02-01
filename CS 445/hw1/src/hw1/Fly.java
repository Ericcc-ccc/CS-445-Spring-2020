package hw1;

public class Fly extends Creature implements Flyer{
	
	//Constructor
	public Fly(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//Method
	public void eat(Thing aThing) {
		System.out.println(this.toString() + " won`t eat a " + aThing.toString());
	}
	
	public void move() {
		this.fly();
	}
	
	public void fly() {
		System.out.println(this.toString() + " is buzzing around in flight.");
	}

}
