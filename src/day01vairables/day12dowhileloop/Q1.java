package day01vairables.day12dowhileloop;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	String a = "";

	do {
	    System.out.println("Write your first and last name: ");
	    a = scanner.nextLine();

	    if (a.length() >= 6) {
		System.out.println("You did it write");

	    } else {
		System.out.println("Try again! longer password");

	    }

	} while (a.length() < 6);

    }

}
