package day01vairables.day13constructors_V18;

public class P03_RemoveDublicateChars {

    public static void main(String[] args) {

	// deleteAllRepeatedChars();
	removeDublicateChars();

    }

    public static void deleteAllRepeatedChars() {

	String input = "012233";
	String nonRepeatedChars = "";

	for (int i = 0; i < input.length(); i++) {
	    if ((input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i)))) {
		nonRepeatedChars = nonRepeatedChars + input.charAt(i);
	    }
	}
	System.out.println(nonRepeatedChars);

    }

    public static void removeDublicateChars() {// I will do this later????

//	String input = "0123333";
//	String removeDublicate = new String();

    }
}
