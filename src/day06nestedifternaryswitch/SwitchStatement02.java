package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement02 {

    public static void main(String[] args) {
	/*
	 * If the user pressed 1, 2, 3 the program will print the number that is
	 * pressed; otherwise, program will print “Not allowed”.
	 */

	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a number: ");
	int a = scanner.nextInt();

	switch (a) {
	case 1:
	    System.out.println(a);
	    break;
	case 2:
	    System.out.println(a);
	    break;
	case 3:
	    System.out.println(a);
	    break;
	default:
	    System.out.println("Not allowed");

	    scanner.close();

	}
    }

}
