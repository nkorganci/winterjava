package day01vairables.day12dowhilevariablesconstructorsPractice;

import java.util.Scanner;

public class A_P1_Practice {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String password = "";

	do {

	    System.out.println("Write the password: ");
	    password = scan.next();

	    if (password.equals("password")) {
		System.out.println("true");

	    } else {
		System.out.println("Try again");

	    }
	} while (!(password.equals("password")));
	// while (password != "password");//why this one did not work.

    }

}
