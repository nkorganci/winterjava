package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		 * Write a code which gives odd/even for a given number
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Write a number: ");

		int userInput = scan.nextInt();

		if (userInput % 2 == 0) {

			System.out.println(userInput + " is an even number.");

		}

		if (userInput % 2 != 0) {
			System.out.println(userInput + " is odd number");
		}

	}

}
