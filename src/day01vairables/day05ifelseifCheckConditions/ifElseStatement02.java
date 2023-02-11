package day01vairables.day05ifelseifCheckConditions;

import java.util.Scanner;

public class ifElseStatement02 {

    public static void main(String[] args) {

    }

    public static void ifElseFirstWay() {

        // ask user to enter a character is alphabet or number or another thing.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scan.next().toUpperCase().charAt(0);

        if (ch <= 'Z' && ch >= 'A') {
            System.out.println(ch + " is an alphabet");
        } else {
            if (ch <= '9' && ch >= '0') {
                System.out.println(ch + " is a number");
            } else {
                System.out.println(ch + " is not a number of char");
            }
        }
    }


    public static void ifElseSecondWay() {

        // ask user to enter a character is alphabet or number or another thing.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scan.next().toUpperCase().charAt(0);


        if (ch <= 'Z' && ch >= 'A') {
            System.out.println(ch + " is an alphabet");
        } else if (ch <= '9' && ch >= '0') {
            System.out.println(ch + " is a number");
        } else {
            System.out.println(ch + " is not a number of char");
        }
    }
}


