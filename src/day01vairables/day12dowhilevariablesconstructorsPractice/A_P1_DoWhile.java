package day01vairables.day12dowhilevariablesconstructorsPractice;

import java.util.Scanner;

public class A_P1_DoWhile {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int userInput = 0;

	do {

	    System.out.println("Write a number: ");
	    userInput = scan.nextInt();

	    if (userInput % 2 == 0) {
		System.out.println("you won");

	    } else {
		System.out.println("Try again");

	    }
	} while (userInput % 2 != 0);

	scan.close();

    }

}
