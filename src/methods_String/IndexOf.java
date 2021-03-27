package methods_String;

public class IndexOf {

    public static void main(String[] args) {

	String n = "aa  a";
	System.out.println(n.replaceAll("\\s", "*"));

	// Returns: An int value, representing the index of the first occurrence of the
	// character in the string, or -1 if it never occurs
//
//	indexOf1();
//	indexOf2();
//	indexOf3();
//	indexOf4();
//	replace1();
//	replace2();

    }

    public static void indexOf1() {// METHOD 1 indexOf(int char);

	String str = "012 456 89";
	System.out.println(str.indexOf('4'));
    }

    public static void indexOf2() {// METHOD 2 indexOf(String str)
	// returns index of given character value or substring. If it is not found, it
	// returns -1

	String str = "012 456 89";
	System.out.println(str.indexOf("456")); // returns the index of 456 substring
    }

    public static void indexOf3() {// METHOD 3 indexOf(int char, int fromIndex):

	// Returns the index within this string of the first occurrence of the specified
	// character
	String str = "012 456 89 012 456 89";
	System.out.println(str.indexOf('4', 5));
    }

    public static void indexOf4() {// METHOD 4 indexOf(String str, int fromIndex);

	String str = "012 456 89 012 456 89";
	String str1 = "Hi how how are are you";

	System.out.println(str1.indexOf("ow", 1));

//	System.out.println(str.indexOf("12", 4));

    }

    public static void replace1() {// METHOD 1: replace(char oldChar, char newChar)
	// returns a string from replacing all occurrences of oldChar in this
	// string with newChar

	String s1 = "javatpoint is a very good website";
	String replaceString = s1.replace('a', 'e');// replaces all occurrences of 'a' to 'e'
	System.out.println(replaceString);

	String str = "Hello Hello World";
	str = str.replace('H', ' ');// There is no empty char, you can not write ''
	System.out.println(str);
	System.out.println(str.replace('H', ' '));
    }

    public static void replace2() {// METHOD 2: replace(CharSequence target, CharSequence replacement)

	// replace all occurrences of a given substring 'target' in string with a new
	// substring code

	String s1 = "my name is aa my name is java";
	String replaceString = s1.replace("is", "was");// replaces all occurrences of "is" to "was"
	System.out.println(replaceString);
    }

    public static void replaceAll1() {// METHOD 1: replaceAll(String regex, String replacement)

	String s1 = "javatpoint is a very good website";
	String replaceString = s1.replaceAll("a", "e");// replaces all occurrences of "a" to "e"
	System.out.println(replaceString);
    }

    public static void replaceAll2() {// METHOD 2: replaceAll(String regex, String replacement)

	String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
	String replaceString = s1.replaceAll("is", "was");// replaces all occurrences of "is" to "was"
	System.out.println(replaceString);

    }

    public static void replaceAll3() {// METHOD 3 replaceAll(String regex, String replacement)
	String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
	String replaceString = s1.replaceAll("\\s", "");// remove all the occurrences of white spaces.
	System.out.println(replaceString);
    }
}
