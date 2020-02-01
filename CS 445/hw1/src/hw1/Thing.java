package hw1;

public class Thing extends java.lang.Object{
	
	//Attribute
	public String name;
	
	//Constructor 
	public Thing(java.lang.String name) {
		this.name = name;
	}
	
	//Method 
	public java.lang.String toString() {
		//QUESTION!!!!!!!!!!!!!!!!!!!!!!!
		if(this instanceof Creature) {
			return name + " " + this.getClass().getSimpleName();
		}else {
			return name;
		}
	}
}
