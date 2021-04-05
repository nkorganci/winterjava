package day04ififelseifthenelse;

import java.util.Scanner;

public class L01_IfStatement01 {

	/*
	1- When you test a condition, you need to check every condition.
	2- Note: to compare strings, DO NOT USE "==". Use "equals()" method. Equal() does not check references.
         == checks both value and reference.
    3- One line should not have more than 80 characters.
	 */

    public static void main(String[] args) {

        //oddEvenNumbers();
        equals();

    }

    public static void oddEvenNumbers() {

		/*
		Get an integer from user,if userinput is even , write" even" otherwise "odd"
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number to check whether it is even or odd: ");

        int userInput = scan.nextInt();

        if (userInput % 2 == 0) {

            System.out.println(userInput + " is an even number.");

        }

        if (userInput % 2 != 0) {
            System.out.println(userInput + " is an odd number");
        }
    }

    public static void weekdayInitials() {
/*
 By using Java code and If statement when you wrtie initial of the day of a week,
 output should be all possible names of the days. If user enter "T", output is tuesday and thursday.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the initial of the any day");

        char initial = scanner.next().toUpperCase().charAt(0);

        if (initial == 'M') {
            System.out.println("Monday");
        }

        if (initial == 'T') {
            System.out.println("Tuesday or Thursday");
        }
        if (initial == 'F') {
            System.out.println("Friday");
        }
        if (initial == 'S') {
            System.out.println("Saturday or Sunday");
        }
        if (initial != 'M' && initial != 'T' && initial != 'F' && initial != 'S') {
            System.out.println("Enter a valid date");


        }
    }

    public static void equals() {
        /*
        Note: to compare strings, DO NOT USE "==". Use "equals()" method. Equal() does not check references.
         == checks both value and reference.
        */

        /*
        Get the date from the user, if user entered weekday, output is "Weekday"
        Otherwise "Weekend"
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the name of the day: ");
        String nameOfDay = scan.next().toLowerCase();

        if (nameOfDay.equals("monday") || nameOfDay.equals("tuesday") ||
                nameOfDay.equals("wednesday") || nameOfDay.equals("thursday") || nameOfDay.equals("friday")) {
            System.out.println("Weekday");
        }
        if (nameOfDay.equals("saturday") || nameOfDay.equals("sunday")) {
            System.out.println("weekend day");
        }


        if (!nameOfDay.equals("monday") || !nameOfDay.equals("tuesday") ||
                !nameOfDay.equals("wednesday") || !nameOfDay.equals("thursday") || !nameOfDay.equals("friday")) {
            System.out.println("Enter a valid day name");
        }

        //What is the purpose of this statement
        if (!nameOfDay.equals("monday") && !nameOfDay.equals("tuesday") &&
                !nameOfDay.equals("wednesday") && !nameOfDay.equals("thursday") && !nameOfDay.equals("friday")) {
            System.out.println("Enter a valid day name");
        }


    } // boolean equals(Object anObject)
}
