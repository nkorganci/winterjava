package a_Questions;

public class AnimalConstructor {

    public int a = 1;
    public static String b = "Hi";

    public static void main(String[] args) {

	// QUESTION: What is the differences between first and second calling method
	System.out.println(AnimalConstructor.b); // first
	System.out.println(b); // second
	System.out.println(b = b + "lo");

	AnimalConstructor obj = new AnimalConstructor();
	System.out.println(obj.a);
	System.out.println(obj.a = obj.a + 3);

    }

    public void name() {
	System.out.println("Java");
	a = a + 1; // QUESTION: how can I call this one. How can I use it.
	System.out.println(a = a + 1);

	int c = 2;// QUESTION: How can I call this in another method or class

	AnimalConstructor obj2 = new AnimalConstructor();
	obj2.name1();// QUESTION: What does this mean.

    }

    public static void name1() { // In order to use another method I need to create obj again.

	AnimalConstructor obj1 = new AnimalConstructor();
	System.out.println(obj1.a);

	System.out.println(AnimalConstructor.b);

	int d = 4; // How can i call this one in anther class or method.

	obj1.name();

    }

}
