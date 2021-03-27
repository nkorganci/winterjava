package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {
	/*
	 * Q1 If input is even , write it is even if input is odd , write it is odd
	 * 
	 * Q2 ask 2 inter, write the bigger one
	 */

	Scanner input = new Scanner(System.in);
	System.out.println("Write a number: ");
	int a = input.nextInt();
	String bString = a % 2 == 0 ? " Even number" : "Odd Number";
	System.out.println(a + bString);

	System.out.println("Write 2 numbers: ");
	int b = input.nextInt();
	int c = input.nextInt();
	int d = b > c ? b : c;
	System.out.println("Bigger one is " + d);

    }

}
