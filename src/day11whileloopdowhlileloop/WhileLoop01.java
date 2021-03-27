package day11whileloopdowhlileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {
	sumOfDigits();
    }

    /*
     * Type java code by using while loop, Write a program that prompts the user to
     * input an integer. It should then find sum of the digits of that number. 123
     * ==> 1+2+3 = 6
     */
    public static void sumOfDigits() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a number");
	int number = scanner.nextInt();
	int originalNumber = number;
	int sum = 0;
	if (number < 0) {
	    number = number * -1;
	}

	while (number != 0) {
	    sum = sum + number % 10;
	    number = number / 10;

	}
	System.out.println("The sum of the " + originalNumber + " is " + sum);
	scanner.close();

    }

}
