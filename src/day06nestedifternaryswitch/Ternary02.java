package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {
	/*
	 * Write a program which returns absolute value
	 */

	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Write a number: ");
	int a = inputScanner.nextInt();

	a = a < 0 ? a * (-1) : a;
	System.out.println("Absolute value is " + a);

    }

}
