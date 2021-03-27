package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		// By using Java code and If statement
		// when you wrtie initial of the day of a week, output should be all possible
		// names of the days.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Write the initial of the any day");

		char initial = scanner.next().toUpperCase().charAt(0);

		if (initial == 'M') {
			System.out.println("Monday");
		}

		if (initial == 'T') {
			System.out.println("Tuesday or Thursday");
		}
		if (initial == 'F') {
			System.out.println("Friday");
		}
		if (initial == 'S') {
			System.out.println("Saturday or Sunday");
		}
		if (initial != 'M' && initial != 'T' && initial != 'F' && initial != 'S') {
			System.out.println("Enter a valid date");

		}

	}

}
