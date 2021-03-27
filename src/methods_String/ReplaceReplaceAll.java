package methods_String;

public class ReplaceReplaceAll {

    public static void main(String[] args) {
	replace1();
	replace2();
	replaceAll1();
	replaceAll2();
	replaceAll3();
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
    }
}
