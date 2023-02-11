package day01vairables.day11whileloopdowhlileloop;

import java.util.Scanner;

public class DoWhileLoop033 {

    public static void main(String[] args) {
	// if the given number is less than 10 print "Won!" on the console
	// otherwise ask User enter another number.

    }

    public static void playGame() {
	Scanner scanner = new Scanner(System.in);
	int num = 0;

	do {
	    System.out.println("Enter an integer to play: ");
	    num = scanner.nextInt();

	} while (num >= 10);
	System.out.println("Congrats, you won!..");
    }

}
