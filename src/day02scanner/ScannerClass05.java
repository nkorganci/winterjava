package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {

	/*
	 * Type a program which asks user first name and last name then print it on the
	 * console
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		// if you wanna get a string data from user, usenextLine() method which gets
		// full String
		String fullName = scan.nextLine();
		System.out.println("Your full name is " + fullName);
		
		System.out.println("Write your kid's first name");
		//If you wanna get a String data which gets only first word.
		String kidFirstName = scan.next();
		System.out.println("Your kid's frist name is " + kidFirstName);
	}

}
