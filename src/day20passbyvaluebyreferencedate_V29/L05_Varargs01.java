package day20passbyvaluebyreferencedate_V29;

public class L05_Varargs01 {
    /*
     * 1- Varargs can be empty but primitive datas can not be zero,must have a
     * value,CTE 2- work like array, must have single value. 3- Varargs should be
     * the last value. 4- Varargs used with for loop most of the time to get
     * elements one by one. 5- Classes can use only PUBLIC or Default, can not use
     * Private...
     * 
     */

    public static void main(String[] args) {

	System.out.println(add1(3, 5));//
	System.out.println(add2(3, 5, 7));// If I would like to add more integer, I need to create a method for each of
					  // them, Will be too many methods
	System.out.println(addVarargs(2, 3, 55));// VarArgs a lot flexible, you can add as many as you want.
	System.out.println(retirementPayment("Jhon", 5, 4));

    }

    public static int add1(int a, int b) {// I can add only 2 items//Bad practice
	return a + b;

    }

    public static int add2(int a, int b, int c) {// I can add only 3 items//Bad practice
	return a + b + c;

    }

    public static int addVarargs(int... a) {// varArgs , Creates like list values, no limit
	// to run different number of arguments use varargs
	// varargs behaves like lists, mutable, but behin the varargs arrays work
	// To declare a varargs use"int... a" or "String... s"
	// varargs must be the last parameter inside the method paranthesis
	// Because varargs can have infinite parameter, the others can not have.
	// Example: int add(int... x, int y), y will never get parameter.
	// varargs are objects.
	// there can not be multiple varargs

	int sum = 0;
	for (int w : a) {
	    sum = sum + w;
	}
	return sum;
    }

    public static String retirementPayment(String empName, int... amount) {//
	int result = 1;
	for (int w : amount) {
	    result = result * w;
	}
	return empName + ":" + result;

    }
}
