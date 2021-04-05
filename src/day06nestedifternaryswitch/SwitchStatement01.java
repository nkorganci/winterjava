package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement01 {

    public static void main(String[] args) {

	/*
	 * User will write the date of the weeks, you will tell the order If you dont
	 * use break, it works after finding correct case.
	 */

	Scanner scanner = new Scanner(System.in);
	System.out.println("Write the number of day: ");
	int a = scanner.nextInt();

	// First way
	if (a == 1) {
	    System.out.println("Sunday");
	} else if (a == 2) {
	    System.out.println("Monday");
	} else if (a == 3) {
	    System.out.println("Tuesday");
	} else if (a == 4) {
	    System.out.println("Wednesday");
	} else if (a == 5) {
	    System.out.println("Thursday");
	} else if (a == 6) {
	    System.out.println("Friday");
	} else if (a == 7) {
	    System.out.println("Saturday");
	} else {
	    System.out.println("Write a valid number");
	}

	 /*
	 Second Way, after 3 condition , use SWITCH, more readable, simple, faster than if else

	 long , double, float, boolean, can not be used
	 String, char, int, byte,short can be used.
	  */


	switch (a) {
	case 1:
	    System.out.println("Sunday");
	    break;
	case 2:
	    System.out.println("Monday");
	    break;
	case 3:
	    System.out.println("Tuesday");
	    break;
	case 4:
	    System.out.println("Wednesday");
	    break;
	case 5:
	    System.out.println("Thursday");
	    break;
	case 6:
	    System.out.println("Friday");
	    break;
	case 7:
	    System.out.println("Saturday");
	    break;
	default:
	    System.out.println("Enter a valid number");

	}

    }

}
