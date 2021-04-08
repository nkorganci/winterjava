package day09methodoverloadingloops;

public class L01_MethodOverloading01 {

    /*
    Method name and method parameters are called "Method Signature"
    In Method overloading, method signature must be different.
    */

    public static void main(String[] args) {

	add('a', 'a');
	add(2.3, 2.6);
	add(2, 5);

    }

    public static void add(int a, int b) {
	System.out.println("int and int " + (a + b));
    }

    public static void add(double a, double b) {
	System.out.println("double and double " + (a + b));

    }

    public static void add(double a, int b) {
	System.out.println("double and int " + (a + b));

    }

    public static void add(char a, char b) {
	System.out.println("int and int " + (a + b));

    }
}
