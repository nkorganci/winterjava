package day05ifelseif;

import java.util.Scanner;

public class IfElseStatment05 {

	public static void main(String[] args) {

		/*
		 * Type java code by using if-else if() statement. A school has following rules
		 * for grading system: 1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From
		 * 80 to 100 - A Ask user to enter marks and print the corresponding grade.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Write your grade: ");
		int a = scanner.nextInt();
		
		/*  FIRST WAY

		if (a < 0) {
			System.out.println("Write a valid number");
		}

		else if (a < 50) {
			System.out.println("Your grades is " + a + "  means D ");

		} else if (a > 50 && a < 59) {
			System.out.println("Your grades is " + a + "  means C ");

		} else if (a > 60 && a < 80) {
			System.out.println("Your grades is " + a + "  means b ");

		} else if (a > 80 && a < 100) {
			System.out.println("Your grades is " + a + "  meansA ");

		} else {
			System.out.println("Write a correct grade");
		}
		*/
		
		// SHORTER WAY
		
		if (a < 0) {
			System.out.println("Write a valid number");
		}

		else if (a < 50) {
			System.out.println("Your grades is " + a + "  means D ");

		} else if (a < 59) {
			System.out.println("Your grades is " + a + "  means C ");

		} else if (a < 80) {
			System.out.println("Your grades is " + a + "  means b ");

		} else if (a < 100) {
			System.out.println("Your grades is " + a + "  meansA ");

		} else {
			System.out.println("Write a correct grade");
		}

	}

}
