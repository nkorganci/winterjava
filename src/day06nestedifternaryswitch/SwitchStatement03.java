package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement03 {

    public static void main(String[] args) {
	/*
	 * Ask user ta enter one of the ‘U’, ‘S’, and ‘A’. Then type a program by using
	 * “switch statement” to print “United” for ‘U’ “States” for ‘S’, and “America”
	 * for ‘A’
	 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a character ");
	char c = scan.next().charAt(0);

	switch (c) {
	case 'U':
	case 'u': // It will work for lower and upper cases.
	    System.out.println("United");
	    break;
	case 'S':
	    System.out.println("States");
	    break;
	case 'A':
	    System.out.println("America");
	    break;
	default:
	    System.out.println("write a valid character");

	    scan.close();

	}

    }

}
