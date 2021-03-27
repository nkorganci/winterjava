package day06nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

	/*
	 * Write a program to check if a year is leap year or not. If the year is
	 * divisible by 100 then it must be divisible by 400. If a year is not divisible
	 * by 100 then it must be divisible by 4.
	 */

	// This is the solution via nested loop which is not recommended.

	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a year: ");
	int year = scanner.nextInt();

	if (year < 0) {
	    System.out.println("Enter a valid year.");

	} else if (year % 100 == 0) {
	    if (year % 400 == 0) {
		System.out.println(year + " is a leap year.");

	    } else {
		System.out.println(year + " is not a leap year.");
	    }

	} else {
	    if (year % 4 == 0) {
		System.out.println(year + " is a leap year.");
	    } else {
		System.out.println(year + " is not a leap year.");
	    }
	}
	scanner.close();

    }

}
