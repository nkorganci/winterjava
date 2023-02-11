package day01vairables.day13constructors_V18;

import java.util.Scanner;

public class P01_PrintFirstLettersofSentence {

    public static void main(String[] args) {
	name();
	// System.out.println(name("nr"));

    }

    public static String name() {

	Scanner scan = new Scanner(System.in);

	System.out.println("Write your first and last name: ");
	String input = scan.nextLine();
	input = input.trim().toUpperCase().replaceAll("\\s+", " ");
	String firstChars = "" + input.charAt(0);

	for (int i = 0; i < input.length(); i++) {

	    if (input.charAt(i) == ' ') {
		firstChars += input.charAt(i + 1);

	    }
	}
	System.out.println(firstChars);
	return firstChars;
    }

}
