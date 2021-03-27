package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {

    public static void main(String[] args) {
	/*
	 * Write a program which checks whether it has 3 digits or not.
	 */

	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Write a number: ");
	int a = inputScanner.nextInt();

	String result = (a > 99 && a < 1000) || (a < -99 && a > 10000) ? "It has 3 digits" : "It has no 3 digits";
	System.out.println(result);

	// Write a program which chects whether word has 2 character or not.

	System.out.println("Write a text");
	String iString = inputScanner.next();
	int n = iString.length();

	String resultString = n >= 0 ? "2 char" : "No 2 char";
	System.out.println(resultString);

    }

}
