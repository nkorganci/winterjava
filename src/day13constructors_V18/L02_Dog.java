package day13constructors_V18;

public class L02_Dog {

    public String name;
    public int weight;
    public int height;

    // Java did not create, this is my constructor.
    // The constructor has nothing inside body.
    // If you create a constructor, java delete "Default" one.
    // If you want to access class members(variables and method), you need to
    // create object of that class.

    public static void main(String[] args) {

	L02_Dog dog1 = new L02_Dog("Joe");
	System.out.println(dog1.name);

//	
//	L02_Dog dog2 = new L02_Dog("Bobby", 3, 5);// object is created
//	System.out.println(dog2.name);
//	System.out.println(dog2.height);
//	System.out.println(dog2.weight);
//
//	sound();
//
//	String str = "Java"; // String object is created, can access everything.

    }

    public L02_Dog() {// Constructor created by developer, not default.

    }

    public L02_Dog(int weight) {// Constructor created by developer, not default.
    }

    public L02_Dog(String name) {
	this.name = name;// name is class variable , not this constructor

    }

    public L02_Dog(int weight, int height) {

    }

    public L02_Dog(String name, int weight, int height) {
	this.name = name;
	this.weight = weight;
	this.height = height;

    }

    public static void sound() {
	System.out.println("Dogs bark....");

    }

}
