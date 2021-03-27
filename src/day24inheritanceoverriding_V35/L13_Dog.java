package day24inheritanceoverriding_V35;

public class L13_Dog extends L12_Mammal {

    public boolean smellWell;
    public int height = 25;

    public L13_Dog() {

	super();// If you type "super()" it is fine,if you do not type Java puts it automatically

	System.out.println("Dog constructor without parameter...");
    }

    public L13_Dog(boolean smellWell) {
	super(true); // super() default constructor.
	// If you do not type any parent constrcutor call inside the first line
	// Java uses the parent constructor without parameter automatically

	// super() is for parent constructor, super. is for parent variables
//	super.haveBaby = true;
//	super.weight = 33;
//	super.height = 99;

	this.smellWell = smellWell;// Class variable
	this.weight = 22;// this checks class variable first of all, if can not find it goes to parent variables.
	super.height = 32;// parent class value, not grandfather one.

    }

}
