package day01vairables.day06nestedifternaryswitch;

import java.util.Scanner;

public class L04_LeapYearInterviewQuestionWithTernary {

    public static void main(String[] args) {
	/*
	 * write a code to decide leap year or not Write a program to check if a year is
	 * leap year or not. If the year is divisible by 100 then it must be divisible
	 * by 400. If a year is not divisible by 100 then it must be divisible by 4.
	 */

	Scanner s = new Scanner(System.in);
	System.out.println("Write a year to check leap or not");
	int a = s.nextInt();
	System.out.println(a % 100 == 0 ? (a % 400 == 0 ? ("Leap Year") : ("Not a leap year"))
						: (a % 4 == 0 ? ("Leap year") : ("not ")));

    }

}
