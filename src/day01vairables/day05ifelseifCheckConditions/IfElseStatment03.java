package day01vairables.day05ifelseifCheckConditions;

import java.util.Scanner;

public class IfElseStatment03 {

    public static void main(String[] args) {

        /*
         * Ask user to enter any day, then get second, fourth and sixth letters of the day and print them on the console
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of a day");
        String dayName = scan.next();

        if (!dayName.equals("monday") && !dayName.equals("tuesday") &&
                !dayName.equals("wednesday") && !dayName.equals("thursday") && !dayName.equals("friday")) {
            System.out.println("Enter a valid day name");
        } else {
            char secondCh = scan.next().charAt(1);
            char fourthch = scan.next().charAt(3);
            char sixthCh = scan.next().charAt(5);

            System.out.println(secondCh + " " + fourthch + " " + sixthCh);
        }


    }

}
