package day01vairables.day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

	/*
	 * Ask user to enter password. If the password has more than 6 characters print
	 * �It is okay� Otherwise, print �Make the password longer than 6 characters�
	 * and ask user to enter a new password
	 */

	Scanner scanner = new Scanner(System.in);

	String input = "";

	do {
	    System.out.println("Enter your password: ");
	    input = scanner.nextLine();

	    if (input.length() > 6) {
		System.out.println("It is okay");

	    } else {
		System.out.println("Make the password longer than 6 characters");
	    }
	} while (input.length() <= 6);

    }

}
