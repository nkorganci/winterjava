package day01vairables.day12dowhileloop;

/*
 * 1) If a variable is created a) inside the class but outside of the main
 * method. b)It is not "static" then it is called "instance variable" which is
 * not a class variable.
 * 
 * 2) if a variable created a) inside the clas but outside of the main body b)
 * it is "static" than it is called "Class variable"
 * Note: "static(class) " and "instance(object) variable differences.
 * a) All updates on a static variables is visible by all objects which are created by class
 *   but all updates on an "instance variable' is visible just by the object.
 *   b) static variables are common for all objects, but instance variables are specified for an object.
 *   
 *   3) If a variable is created inside a method, it is called local variable.
 *     NOTE: There is no default value for local values. You need to assign a value initialize.
 *     NOTE2: Local values inside a methods which is static is also static.
 *     NOTE3; You can not use local variables outside of the class.
 */

public class InstanceLocalAndClassVariables {

    int i = 12; // This is instance variable.
    int k; // This is instance variable. Java assign default value ( zero)
    String str; // make it static to see Default vale is null
    boolean bl; // This is also instance value, default value is false.
    char ch; // default character is '', no character.

    static byte by;// This is a class variable.

    public static void main(String[] args) {

	short sh = 11;// This is a local variable, which need to be initialized.

	int c = 2; // no complain because initialize.
	c++;

	int d; // complaining becauese NOT initialize.
	//d++;

    }

}
