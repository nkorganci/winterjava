package day07stringmethods;

public class HashCode {

    public static void main(String[] args) {

	// System.out.println(trim(" Hi World "));
	// System.out.println(hashcode("a", "bxc"));
	// indexOf(1);
	// System.out.println(contains("hello"));
	System.out.println(substring("Hello"));

	String aString = "Hello";
	aString.indexOf(aString, 0);

    }

    public static String trim(String a) {
	// METHOD: trim()
	// It returns a String after removing ONLY leading and trailing white spaces
	// from the input String, does not remove middle ones
	String c = a + "\n" + a.trim();
	return c;

    }

    public static String hashcode(String a, String b) {

	// METHOD: hashCode()
	// returns the hash code for the String
	// if you give variable value in method, it does not accept the entered ones.

	// a = "Hello";
	// b = "Hello";
	if (a.hashCode() == b.hashCode()) {
	    System.out.println("Same words");
	} else {
	    System.out.println("They are not same");

	}

	return "Good Job";

    }

    public static int indexOf(int a) {

	// int indexOf(int ch): It returns the index of the first occurrence of
	// character ch in a given String.
	// int indexOf(int ch, int fromIndex): It returns the index of first occurrence
	// of character ch in the given string after the specified index “fromIndex”.
	// int indexOf(String str): Returns the index of string str in a particular
	// String.
	// int indexOf(String str, int fromIndex): Returns the index of string str in
	// the given string after the specified index “fromIndex”.

	String name = "01234567891";
	System.out.println(name.indexOf('6'));
	System.out.println(name.indexOf('6', 3));
	System.out.println(name.indexOf("678"));
	System.out.println(name.indexOf("678", 3));

	a = name.indexOf(a);

	return a;

    }

    public static boolean contains(String a) {
	// checks whether a particular sequence of characters is part of a given string
	// or not.

	return a.contains("h");

    }

    public static String substring(String a) {
	// used to get the substring of a given string based on the passed indexes.
	System.out.println(a.substring(2));

	return a.substring(3);

    }

    public void name() {
	// returns the String representation of the boolean, char, char array, int,
	// long, float and double arguments.
    }

}
