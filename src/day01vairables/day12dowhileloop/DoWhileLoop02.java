package day01vairables.day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {
	/*
	 * Ask user to enter his/her first name If the initial is lower case print a
	 * message like �Make the initial upper case� If the initial is upper case print
	 * a message like �You did it right�
	 */
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your first name: ");
	String fn = "";

	do {
	    fn = scanner.next();
	    System.out.println("Write your name: ");
	    String name = scanner.next();

	    if (fn.charAt(0) >= 'A' && fn.charAt(0) <= 'Z') {
		System.out.println("You did it correct!...");
	    } else {
		System.out.println("Please, make the initial uppercase");
	    }

	} while (!(fn.charAt(0) >= 'A' && fn.charAt(0) <= 'Z'));
	scanner.close();
    }

}
