package hw1;

public abstract class Creature extends Thing {
	
	public String last_thing_ate = null;

	//Constructor 
	public Creature(java.lang.String name) {
		super(name);
		
	}
	
	//Method
	public void eat(Thing aThing) {
		System.out.println(this.toString() + " has just eaten a " + aThing.toString());
		last_thing_ate = aThing.toString();
	}
	
	public abstract void move();
	
	public void whatDidYouEat() {
		if (last_thing_ate == null) {
			System.out.println(this.toString() + " has had nothing to eat!");
		}else {
			System.out.println(this.toString() + " has eaten a " + last_thing_ate + "!");
		}
	}

}
