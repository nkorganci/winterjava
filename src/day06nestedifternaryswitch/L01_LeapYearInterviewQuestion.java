package day06nestedifternaryswitch;

import java.util.Scanner;

public class L01_LeapYearInterviewQuestion {

    public static void main(String[] args) {
        /*
         * write a code to decide leap year or not Write a program to check if a year is
         * leap year or not. If the year is divisible by 100 then it must be divisible
         * by 400. If a year is not divisible by 100 then it must be divisible by 4.
         */

        leapYear(1603);

    }

    public static int leapYear(int year) {
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
        return year;
    }

    public static void leapYearNestedLoop1() {

        /*
        nestedIf loop is not recommended, it should be as simple as possible
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a year: ");
        int year = scanner.nextInt();

        if(year<0){
            System.out.println("Enter a valid year");
        }else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a leap year");
            }

        } else {
            if (year % 4 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }

        }
    }

}
