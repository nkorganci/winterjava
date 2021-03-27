package day11whileloopdowhlileloop;

import java.util.Scanner;

public class AAQ3 {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a number to win: ");

	int input = scanner.nextInt();
	int a = 10;

	do {

	    if (input == a) {
		System.out.println("You won!");
	    } else {
		System.out.println("Try again");
	    }

	} while (input != a);

    }

}
