package day07stringmethods;

public class StringEqualsAndIgnoreCase {

    public static void main(String[] args) {
	// equals() and equalsIgnoreCase() methods are used to compare strings. It gives
	// boolean.

	// METHOD equals(): is case sensitive

	String str1 = new String("Hello");
	String str2 = new String("Hi");
	String str3 = new String("Hello");

	boolean equal = str1.equals(str3);
	System.out.println(equal);
	// It compares two string

	System.out.println(str1.equals(str3));// true
	System.out.println(str1.equals(str2));// false

	// METHOD equalsIgnoreCase(): is not case sensitive

	String str4 = new String("Apple");
	String str5 = new String("MANGO");
	String str6 = new String("APPLE");

	System.out.println(str4.equals(str6));
	System.out.println(str4.equalsIgnoreCase(str6));

    }

}
