package day01vairables.day12dowhilevariablesconstructorsPractice;

public class AnimalConstructor {

    public int age;
    public String name;
    public int weight;

    public int a = 1;
    public static String b = "Hi";

    public static void main(String[] args) {

	System.out.println(AnimalConstructor.b);// Static(class variable) can be called by class name
	System.out.println(b);
	b = b + "lo";

	AnimalConstructor obj = new AnimalConstructor();// I created animal object to call non static ones.
	System.out.println(obj.a); // I called int a

	obj.name1(); // What is the differences and relation between this

	AnimalConstructor.name1();// And this one

    }

    public void name5() {
	System.out.println("Java");
	a = a + 1;

	AnimalConstructor obj3 = new AnimalConstructor();

	    }

    public static void name1() {
	System.out.println("Java1");
	AnimalConstructor obj2 = new AnimalConstructor();

    }

}
