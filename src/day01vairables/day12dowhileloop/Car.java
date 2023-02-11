package day01vairables.day12dowhileloop;

public class Car {

    /*
     * When you created a class, java knows you will create objects. to create
     * objects you need "constructor" which is behind the class for you.These types
     * are called default constructors.
     */
    public String make = "Honda";
    public String model = "accord";
    public int price = 2000;
    public int year;

    public static void main(String[] args) {
	// Constructor looks like a method but it is a code of block.
	// Constructor creates object form class.

	Car myCar = new Car();// after new "Car" is the constructor.
	System.out.println(myCar.make);
	System.out.println(myCar.model);
	System.out.println(myCar.price);
	myCar.move();

    }

    public static void move() {
	System.out.println("Moves fast");
    }

}
