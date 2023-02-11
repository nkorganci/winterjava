package day01vairables.day10forloops;

import java.util.Scanner;

public class ForLoopPalindrome {

    public static void main(String[] args) {

	checkPalindrome();
	/*
	 * 1)Ask user to enter a String
	 * 2)Check the String if it is Palindrome or not
	 */

    }

    public static void checkPalindrome() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("write a string to check it Palindrome or not");
	String input = scanner.nextLine();
	String reverse = "";

	for (int i = input.length() - 1; i >= 0; i--) {
	    reverse = reverse + input.charAt(i);
	}
	if (input.equals(reverse)) {
	    System.out.println("Palindrome");
	} else {
	    System.out.println("Not Palindrome");
	}
	scanner.close();
    }

}
