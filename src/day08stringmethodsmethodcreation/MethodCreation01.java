package day08stringmethodsmethodcreation;

public class MethodCreation01 {

    /*
     * 1- Methods can be created outside of the main method.
     * 2- variables created in method parenthesis is called parameter==> num1, num2
     * 3- The values which are used in method call are called "arguments" ==> 3, and 5
     * 3- If you want to call a method in main method, you have to make it static.
     */

    /*
     * 1- we can use same method name but number of parameters or types must be different.
     * 2- If the data types of parameters are different, you may change the orders to get another method.
     * 3- If you change return type it still give same error.
     * 4- Changing access parameter does not change method type
     * 5- If you change static key word, you can not change again the method.
     * 4- If you create methods whose names are same , parameters are different in a class, it is called "Method Overloading"
     */

    public static void main(String[] args) {

        addition(3.2, 5.3);
        //addition('a','b');
        //addition("Hi","bye");//compile time error
    }

    public static double addition(double num1, double num2) {
        System.out.println(num1 + num2);
        return num1 + num2;

    }

    public static double addition(int num1, double num2) {
        System.out.println(num1 + num2);

        return num1 + num2;

    }

    public static double addition(short num1, double num2) {

        return num1 + num2;

    }
     double addition(int num1, float num2) {

        return num1 + num2;

    }

}
