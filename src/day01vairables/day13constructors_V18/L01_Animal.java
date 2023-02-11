package day01vairables.day13constructors_V18;

public class L01_Animal {

 /*  1-Constructor must have same name with the class
     2-Constructor names start with Uppercases to match class name
     3-Constructor has no return type, method has return type
     4- if you use in a main method no need to make static??
     5- Constructor is used to initialize an object
     */

    public String name = "Joe";
    public int weight = 33;
    public static boolean isHerbivorous = true;

    public static void main(String[] args) {

	L01_Animal dog = new L01_Animal();

	// 1- Calling class variables with constructor

	String str = dog.name;
	System.out.println(dog.name);
	System.out.println(dog.weight);
	System.out.println(dog.isHerbivorous);

	// 2-Calling methods with constructor

	dog.move(); // We can call static without constructor.
	L01_Animal.move();
	move();

	dog.eat();
	dog.drink();
	eat();

    }

    public static void move() {
	System.out.println("Moves");
	int a = 2;

    }

    public static void eat() {

	if (isHerbivorous) {
	    System.out.println("Eats plants");

	} else {
	    System.out.println("Eats both plants and meat");
	}

    }

    public static void drink() {
	System.out.println("Drink water");

    }

}
