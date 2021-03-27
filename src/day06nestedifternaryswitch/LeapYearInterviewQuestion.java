package day06nestedifternaryswitch;

import java.util.Scanner;

public class LeapYearInterviewQuestion {

    public static void main(String[] args) {
	/*
	 * write a code to decide leap year or not Write a program to check if a year is
	 * leap year or not. If the year is divisible by 100 then it must be divisible
	 * by 400. If a year is not divisible by 100 then it must be divisible by 4.
	 */

	Scanner scanner = new Scanner(System.in);

	System.out.println("Write a year: ");
	int year = scanner.nextInt();

	if (year % 100 == 0 && year % 400 == 0) {

	    System.out.println(year + " is a Leap year");

	} else if (year % 4 == 0) {

	    System.out.println(year + " is a Leap year");

	} else {
	    System.out.println(year + " is not a leap year");

	}

	scanner.close();

    }

}
