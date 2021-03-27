package day08stringmethodsmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {

	System.out.println(addition(2, 3));
	System.out.println(addition('a', 'b')); // char value is used as a number addition.
	//System.out.println(addition("fda", "dsfdb"));// red underline is a compile error

	/*
	 * Methods can be created outside of the main method. variables created in
	 * method is called parameter. "static" method can cuse only static class
	 * members
	 * 
	 */

	/*
	 * we can use same method name but number of parameters or types must be
	 * different.
	 * 
	 * If the data types of parameters are different, you may change the orders to
	 * get another method.
	 * 
	 * NOTE for interview: If you create methods whose names are same but parameters
	 * are differnet in a class, this is called "Method overloading"
	 * 
	 * If you change return type it still give same error. Changing access parameter
	 * does not change method type
	 * 
	 * Method overloading is in A CLASS.
	 */

    }

    public static double addition(double num1, double num2) {
	return num1 + num2;

    }

    public static double addition(int num1, double num2) {
	return num1 + num2;

    }

    public static double addition(short num1, double num2) {
	return num1 + num2;

    }

}
