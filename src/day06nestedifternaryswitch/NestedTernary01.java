package day06nestedifternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {

    public static void main(String[] args) {

	/*
	 * If the integer is not negative then check if it is less than 10 then return
	 * “The integer is digit” If the integer is negative return “Negatives cannot be
	 * a digit” Use nested ternary...
	 */

	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a number: ");
	int a = scanner.nextInt();

	System.out.println(
		a >= 0 ? (a >= 10 ? ("The integer is digit") : ("Not a digit")) : ("Negative can not be digit"));

    }

}
