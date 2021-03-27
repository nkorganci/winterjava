package day24inheritanceoverriding_V35;

public class L14_Runner {
    /*
     * 1)To create an object you can use just a single constructor????
     * 2)super() keyword must be in the first line inside the constructor
     * 2a) super() is in the constructor as a default even if you dont write.
     * 2b) function of super() is , go to parent constructor.
     * 3)You can use super() key word just once in a constructor.
     * 4)If you make constructor call for a non-existing constructor from parent class, you will get compile time error.
     * 5)this() ==> Calls the constructors inside the class itself, you can navigate between constructors in same class.
     * super() ==> Calls the constructors from parent class
     * 6-Dog class can use all other constructors"Parent", "grandparent"... Super()
     * 7-Super() must be on the first line super() key word send class to parent class. Object has no super key word.
     * Constructors executed from top to bottom( parent to child) super() call constructor, you can use super in
     * constructor just once.
     * 8-If you call a constructor for a non-existing constructor from parent class, you will get CTE this(): ==> calls the
     * constructors inside the class itself super():==> calls constructors from parent class
     * 9-super() is for parent constructor call, super. is for parent variables call
     * 10- "this" key word checks class variable/data, if it can not find it, it goes to parent variables.
     * 11-"super" key word is get data from the closest data.
     */

    public static void main(String[] args) {// Animal has a constructor
//	animalHasAConstructor();
//	animalHastwoConstructor();
//	variablesCheck();
//	weightHeight();
	weightHeight();

    }

    public static void animalHasAConstructor() {// Constructor has no parameter

	/*
	 * L13_Dog is the child of all others so can get constructors from them.It runs from top to bottom.
	 * We dont see anything from Object class because it is empty, we did not write a code.
	 */
	L13_Dog dog1 = new L13_Dog();
    }

    public static void animalHastwoConstructor() {// Constructor has parameter via super key word.
	L13_Dog dog1 = new L13_Dog();

    }

    public static void variablesCheck() {// QUESTION: I should be able to use them without this??? I should able to get Public ones?
	L13_Dog obj1 = new L13_Dog();
	// I can get the variables
//	obj1.height;
//	obj1.weight;
//	obj1.smellWell

    }

    public static void weightHeight() {
	L13_Dog obj2 = new L13_Dog(true);
	System.out.println(obj2.height);
	System.out.println(obj2.weight);
	System.out.println(obj2.haveBaby);

	System.out.println(obj2.smellWell);
	L04_Audi obj3 = new L04_Audi();
	obj3.move();// Audi moves very fast is coming from Audi class, Vehicle moves come from vehicle class.
    }

}
