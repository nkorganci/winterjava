package day01vairables.day14constructorsstatickeywordarrays_V19;

// 1- -->source-->generate constructor using Fields: from eclipse
// 2- this() is a constructor call
// 3- this.x=x can update class variable, otherwise x is a local variable
// 4- Do not use static variables in constructor
// 5- Only non static ones will be used in constructor
// 6- constructor can be called in constructor not in main method.
// 7- Constructors should be after variables.
// 8- this();// Must be on the first line. It means go to constructor.

public class L01_Animal {

    public static String name = "Joe";
    public int wight = 33;
    public boolean herbivorous = false;

    public L01_Animal() { // 1
	System.out.println("1st constructor is executed");
    }

    public L01_Animal(String name) { // 2
	System.out.println("2nd constructor is executed");
	this.name = name;
    }

    public L01_Animal(String name, int wight) { // 3

	System.out.println("3rd constructor is executed");
	this.name = name;
	this.wight = wight;
    }

    public L01_Animal(String name, int wight, boolean herbivorous) { // 4
	System.out.println("4th constructor is executed");
	this.name = name;
	this.wight = wight;
	this.herbivorous = herbivorous;
    }

    public static void main(String[] args) { // main method

	// 1st example Animal dog1 = new Animal("Cat", 25); // it will call first
	// this(); than its own statements.
	// 2nd example Animal dog1 = new Animal();
	L01_Animal dog1 = new L01_Animal("Mark", 34, false);
    }

}
