package day23encapsulationInheritance_V34;

public class L01_Encapsulation01 {

    /*
     * getter method should be public to reach it.
     * To make "initial" variable just readable, you should not create "setter",
     * create just "getter"
     * Immutable class: make a variable as a private, do not use set method, it will
     * be immutable method.
     * How can you make a class immutable: make all variables private and do not
     * create setter method.
     * If you call non existing method, it gives CTE, code can not be executed.
     * return is end of execution, break is end of the loop.
     * Except Object class, all classes has parent.
     */

    private String name = "Ali Can"; // name is encapsulated.
    private int age = 21;// private can be accessed inside same class, but not other classes.
    private boolean retired = false;
    private char initial = 'A';
    private String address = "Miami";

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    public String getName() {// get method must be public and have the same name with private variable and
			     // same data type.
	return name;// Must be same with private one
    }

    public int getAge() {
	return age;

    }

    public void setName(String name) {// we can use differnt variable name, but generally same one is used.
	// set method update value only, so do not return anything.
	// void is used a) when you print sth on the console
	// b) when you do an action.
	this.name = name;
    }

    public void setAge(int age) {
	this.age = age;

    }

    public boolean isRetired() {// If the data type is boolean, java start with is, it is not must, this is a
				// naming convention.
	return retired;
    }

    public void setRetired(boolean retired) {
	this.retired = retired;
    }

    public char getInitial() {// setter is not inserted, so you can just read, not update, setter is used to
			      // read code.
	return initial;
    }

    public void setAddress(String address) {// we can not read but update.
	this.address = address;
    }

}
