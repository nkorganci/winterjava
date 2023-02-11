package day01vairables.day13constructors_V18;

public class P03_NonRepeatedLettersInString {

    public static void main(String[] args) {

	String input = "111161113112";
	String nonRepeatedChars = "";

	for (int i = 0; i < input.length(); i++) {
	    if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) {
		nonRepeatedChars += input.charAt(i) + " ";
//		System.out.print(input.charAt(i) + " ");

	    }

	}
	System.out.println("Unique letters are: " + nonRepeatedChars);

    }

}
