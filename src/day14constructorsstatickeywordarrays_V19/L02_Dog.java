package day14constructorsstatickeywordarrays_V19;

public class L02_Dog {

    int a = 2;
    static String b = "Hi";

    // 1-Only class can have static variable, no local static variable
    // 2- Static is attached to class, non static is attached to objects.
    // 3- to access a static methods, call it directly or via class
    // to access non static ones use consructor and call it by object.
    public static void main(String[] args) {

	L02_Dog obj = new L02_Dog();

	obj.a = obj.a + 2;// Non-static called by object.

	eat();// Static method can be called directly

	b = b + "  man";// Static variable can be called directly
	L02_Dog.b = L02_Dog.b + "man";// QUESTON:What is the differences??
    }

    public static void eat() {
	System.out.println("This is static eat method...");
	
	 int inta = 2;
	//static int inta1 = 2;// it gives erro, because no local static variable

    }

    public void drink() {
	System.out.println("This is not static drink method...");

    }

}
