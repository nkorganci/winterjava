package day13constructors_V18;

// 1-A constructor in Java is a special method used to initialize objects
// 2- The constructor is called when an object of a class is created.
// 3-It can be used to set initial values for object attributes:
// 4-a constructor to give initial values to the instance variables defined by
// the class, or to perform any other start-up procedures required to create a
// fully formed object.
// 5-a constructor also contains collection of statements(i.e. instructions)
// 6- Static key word and methods  do not need constructor
// 7- objects are used to call non static keyword and methods.
public class L03_Constructors01 {

    public int num = 1; // Create a class attribute
    public String name = "aa";

    public L03_Constructors01() {// Create a class constructor for the L03_Constructors01() class

	// num = 5; // Set the initial value for the class attribute x
	System.out.println("Constructor01" + num + " " + name);
    }

    public L03_Constructors01(int num, String name) {
	this.num = num;// If i dont write "this" default value will be printed.
	this.name = name;

    }

    public static void main(String[] args) {
	method1();
	method2();

    }

    public static void method1() {
	L03_Constructors01 myObj = new L03_Constructors01();// no parameter, print/call default ones.
	L03_Constructors01 myobj2 = new L03_Constructors01(3, "Ali");

	System.out.println(myobj2.num);
	System.out.println(myobj2.name);

    }

    public static void method2() {
	L03_Constructors01 myObj1 = new L03_Constructors01();
	System.out.println(myObj1.num);

    }

    public static void method3(int num, String name) {

    }

}
