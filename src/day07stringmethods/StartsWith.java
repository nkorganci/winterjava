package day07stringmethods;

public class StartsWith {

    public static void main(String[] args) {
	// It returns a boolean value true or false based on whether the given string
	// begins with the specified LETTER or Particular WORD.

	String aString = "Hello World";
	String bString = "He";
	char a = 'a';

	System.out.println(aString.startsWith(bString));
	System.out.println(aString.startsWith("Hea"));
	// It does not support char

	System.out.println(aString.startsWith("W", 6));
	// We can decide the starting point.

    }

}
