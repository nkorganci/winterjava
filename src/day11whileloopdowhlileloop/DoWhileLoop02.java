package day11whileloopdowhlileloop;

public class DoWhileLoop02 {
    public static void main(String[] args) {

    }

    public static void countCharacters() {
	// For the String “1234_?!abcdef”, type a code to count the number of letters,
	// the number of digits and the number of others by using do-while loop

	String a = "1234_?!abcdef";
	int index = 0;
	int digitCounter = 0;
	int letterCounter = 0;
	int othersCounter = 0;

	do {
	    boolean isDigit = a.charAt(index) >= '0' && a.charAt(index) <= '9';
	    if (isDigit) {
		digitCounter++;
	    }
	    boolean isLetter = (a.charAt(index) >= 'a' && a.charAt(index) <= 'z')
		    || (a.charAt(index) >= 'A' && a.charAt(index) <= 'Z');
	    if (isLetter) {
		letterCounter++;
	    }
	    boolean isOthers = !isDigit && !isLetter;
	    if (isOthers) {
		othersCounter++;

	    }

	    index++;

	} while (index < a.length());

	System.out.println("The number of digits: " + digitCounter);
	System.out.println("The number of other: " + othersCounter);
	System.out.println("The number of digits: " + letterCounter);

    }
}
