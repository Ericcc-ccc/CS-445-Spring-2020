package hw1;

public class TestCreature extends java.lang.Object{
	public static final int THING_COUNT = 10;
	public static final int CREATURE_COUNT = 6;

	public static void main(java.lang.String[] args) {

		//Create some Creature instances
		Creature[] creatures = new Creature[CREATURE_COUNT];

		creatures[0] = new Ant("Brad Pitt");
		creatures[1] = new Bat("Angelina Jolie");
		creatures[2] = new Fly("Leonardo DiCaprio");
		creatures[3] = new Tiger("Johnny Depp");
		creatures[4] = new Ant("Tom Cruise");
		creatures[5] = new Bat("Megan Fox");
		
		//Create some simple Thing instances
		Thing[] things = new Thing[THING_COUNT];
		things[0] = new Thing("Apple");
		things[1] = new Thing("Banana");
		things[2] = new Thing("Orange");
		things[3] = new Thing("Pineapple");
		
		//Add the Creature instances to the array of simple Thing instances
		things[4] = creatures[0];
		things[5] = creatures[1];
		things[6] = creatures[2];
		things[7] = creatures[3];
		things[8] = creatures[4];
		things[9] = creatures[5];
		
		//Print a heading "Things:" followed by a blank line
		System.out.println("Things:");
		System.out.println("");
		
		//print each thing, which each print one line about themselves
		for (int i = 0; i < things.length; i++ ){
			System.out.println(things[i].toString());
		}
		
		//print a blank line
		System.out.println("");
		
		//print a heading "Creatures:" followed by a blank line
		System.out.println("Creatures:");
		System.out.println("");
		
		//print each creature
		for (int i = 0; i < creatures.length; i++ ){
			creatures[i].eat(things[i]);
			creatures[i].move();
			creatures[i].whatDidYouEat();
		}
		
		//print a blank line
		System.out.println("");

	}
}

