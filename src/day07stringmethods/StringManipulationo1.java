package day07stringmethods;

import java.util.Scanner;

public class StringManipulationo1 {

    public static void main(String[] args) {

	// STRING METHOD: endsWidth() is used to check the last character in a String
	// is used with only String, not a character, it returns boolean

	String str = "Java is java";

	System.out.println(str.endsWith("a"));// true
	System.out.println(str.endsWith("f"));// false
	System.out.println(str.endsWith("ava"));// true
	System.out.println(str.endsWith("naava"));// false

	// endWidth() check the last character/s in a String

	System.out.println(str.startsWith("J")); // true
	System.out.println(str.startsWith("Java")); // true
	System.out.println(str.startsWith("Javs")); // false
	System.out.println(str.startsWith("i", 5));// true

	// isEmpty() is used to check if a String has zero character or not, returns
	// true or false

	System.out.println(str.isEmpty()); // false
	String str2 = "";
	System.out.println(str2.isEmpty()); // true

	// replace method

	System.out.println(str.replace("a", "x"));// replaces all the characters or texts which matches
	System.out.println(str); // Java is immutable, can not be changed, you need to assign it to change.

	System.out.println(str.replace("ava", "x")); // multiple char can be replaced

	System.out.println(str.replace('a', 'm')); // character is working
	// System.out.println(str.replace('a', "s")); // data types should be same.

	// replaceAll: you can not use char, in replace method you can use char
	// replaceAll: you can use regular expressions

	System.out.println(str.replaceAll("a", "m"));

	/*
	 * Regular expressons ==> 1) \\s: space character 2) \\S: all characters
	 * exceptspace character 3) \\w: a->z A ->Z _ 0->9 4) \\W: All characters except
	 * a->z A ->Z _ 0->9 5) \\d: 0-9 changes only digits. 6) \\D: 0-9 changes ALL
	 * except digits.Opposite of d expression.
	 * 
	 */

	String str3 = "Java123 learn, earn_money!!  .";
	System.out.println(str.replaceAll("\\s", "*"));
	System.out.println(str.replaceAll(" ", "*")); // does same thing but 1st one is ???
	System.out.println(str.replaceAll("\\S", "*"));
	System.out.println(str.replaceAll("\\w", "*"));
	System.out.println(str.replaceAll("\\W", "*"));

	// replaceFirst() changes just the first occurence of the character

	System.out.println(str3.replaceFirst("a", "x"));

	// substring method is the one of the most important one.
	// It is used to get a part of the string

	String str4 = "Java is the best";

	System.out.println(str4.substring(3));// it start to cut from index number 3.
	System.out.println(str4.substring(16));
	// System.out.println(str4.substring(17)); // if you use any index greater than
	// length it returns
	// java.lang.StringIndexOutOfBoundsException

	/*
	 * Ask user to enter a stirng if the 1st and the last char of the string are
	 * same print "Woow" on the console, otherwise, print "Hmm"
	 */
	// substring can have 2 parameter, first one is incluse, 2nd one is exclusive.

	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a text");
	String s = scanner.nextLine();
	String firString = s.substring(0, 1); // char first = s.charAt(0) can not be used, this is a character.
	String laString = s.substring(s.length() - 1);

	if (firString.equals(laString)) {
	    System.out.println("wov");

	} else {
	    System.out.println("hmm");

	}

	// Question:

	String str5 = "Java is an OOP language";
	System.out.println(str5.substring(3, 5));
	System.out.println(str5.substring(3, 3));// writes nothing
	System.out.println(str5.substring(7, 5)); // error java.lang.StringIndexOutOfBoundsException

	/*
	 * Runtime and Compile error comparison: 1) While you are writing a code, you
	 * may get red underline which is called Compile time error. 2) When you run the
	 * Code you you may not see red underlined but after you run, you may see red
	 * text which is called runtime error
	 */

    }
}
