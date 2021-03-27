package day11whileloopdowhlileloop;

import java.util.Scanner;

public class AAQ1 {

    public static void main(String[] args) {
	name();

    }

    public static void name() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a number: ");
	int input = scanner.nextInt();

	int i = 1;
	if (i <= input) { // How can I add while in to if loop
	    while (input % i == 0) {
		System.out.print(i + " ");
		i++;
	    }

	}

    }

}
