package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {

    /*
     * 1) Type ==> Scanner scan = new Scanner(System.in);
     */

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	// New always create a new object.
	// scan variable name is used generally by programmers.

	System.out.println("write a number");

	int num1 = scan.nextInt();
	System.out.println(num1);

	System.out.println("write the secondnumber");
	int num2 = scan.nextInt();
	System.out.println(num1 + num2);
    }

}