package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {

    public static void main(String[] args) {
	/*
	 * If the integer is negative return “This integer is negative” If the integer
	 * is positive return its square. Use ternary...
	 * 
	 */
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int a = scanner.nextInt();

	System.out.println(a < 0 ? "This integer is negative" : a * a); // If ternary has two different return type, do
									// not asign to any variable

	scanner.close();

    }

}
