package day05ifelseif;

import java.util.Scanner;

public class IfElseStatment04 {

	public static void main(String[] args) {

		/*
		 * Type java code by using if-else if() statement, if both of the two integers
		 * are positive, output will be the sum of them. If both of the two integers are
		 * negative, output will be the multiplication of them. Otherwise; output will
		 * be “I cannot add or multiply different signed numbers”
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Write 2 number");

		System.out.println("Write your 1st number: ");
		int num1 = scan.nextInt();

		System.out.println("Write your 2nd number: ");
		int num2 = scan.nextInt();

		if (num1 > 0 && num2 > 0) {
			System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
		

		} else if (num1 < 0 && num2 < 0) {
			System.out.println(num1 * num2);
		}
			else if (num1 == 0 && num2 == 0) {
			System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
			
		} else {
			System.out.println("I can not add or multiply different signted numbers");
		}

	}

}

