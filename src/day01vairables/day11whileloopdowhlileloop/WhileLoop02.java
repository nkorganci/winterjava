package day01vairables.day11whileloopdowhlileloop;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {
	factorsOfInteger();
    }

    /*
     * Type java code by using while loop, Write a program to count the factors of
     * an integer which is entered by user. Factors of 12 = 1, 2, 3, 4, 6, 12
     */
    public static void factorsOfInteger() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("write a number: ");
	int input = scanner.nextInt();
	int counter = 0;
	int i = 1;
	while (i <= input) {
	    if (input % i == 0) {
		counter++;

	    }
	    i++;

	}
	System.out.println(counter);

    }

}
