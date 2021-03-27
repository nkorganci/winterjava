package day06nestedifternaryswitch;

public class StringManipulations01 {

    public static void main(String[] args) {
	/*
	 * String Methods toUppercases toLowerCase charAt() equals() length() next()
	 * nextLine() indexOf, lastIndexOf(), contains()
	 */

//	// METHOD: indexOf returns first occurence of the character.
//
//	String str = "Java is easy if you study";
//
//	str.indexOf("i");
//	System.out.println(str.indexOf("i"));
//
//	System.out.println(str.indexOf("x"));
//	// If there is no character , return -1
//
//	System.out.println('i');
//	// it works for character too
//
//	System.out.println("easy");
//	// If you write multiple character, it gives 1st character
//
//	System.out.println(str.indexOf('i', 8));
	// It start checking after 8(inclusive)

	/*
	 * Ask user to enter a String and a character, then check if the String has THAT
	 * character or not.
	 */

//	Scanner s = new Scanner(System.in);
//
//	System.out.println("Write a text: ");
//	String iString = s.nextLine();
//
//	System.out.println("Write a character: ");
//	char ch = s.next().charAt(0);
//
//	if (iString.indexOf(ch) != -1) {
//	    System.out.println("we have this character");
//	} else {
//	    System.out.println("there is no such character");
//
//	}

	// METHOD: lastIndexOf() returns the index of last occurence of the character
	String t = "0123456996789";

	// In lastIndexOf() method you can use char and String. Both are acceptable
	System.out.println(t.lastIndexOf('5'));// 11
	System.out.println(t.lastIndexOf("3"));// 11

	// lastIndexOf() method returns -1, if the character does not exist in the
	// String
	System.out.println(t.lastIndexOf("w"));// -1

	// lastIndexOf() returns the index of first character of last occurence of
	// "Java"
	System.out.println(t.lastIndexOf("23"));// 8

	// If you use lastIndexOf() with 2 parameters, get the character starting with
	// the index and to the begining of the String
	// In the following example we are usen "Java a"
	System.out.println(t.lastIndexOf("9", 5));
//
//	
	// Contains Method
//	
	/*
	 * // * Ask user to give you a String and a character If the character does not
	 * exist // * in the string or exists just once print "Not Good" If the
	 * character is used // * multiple times print "Woow" //
	 */

	// contains () is used to check if a single character or multiple charactes
	// exist in a String
	// contains can not contain chars, you have to use String. contain methods
	// return BOOLEAN

	String rString = "Learn Java, earn money";
	System.out.println(rString.contains("e"));

    }

}
