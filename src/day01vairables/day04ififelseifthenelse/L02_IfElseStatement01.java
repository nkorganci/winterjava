package day01vairables.day04ififelseifthenelse;

import java.util.Scanner;

public class L02_IfElseStatement01 {

    public static void main(String[] args) {
    charOrNot();
    }

    public static void nestedIfElseSquareOrNot() {

        // Decide whether it is square or rectangle

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write length and width");

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        if (length <= 0 || width <= 0) {
            System.out.println("Width and length can not be negative or zero");
        } else {
            if (width == length) {
                System.out.println("square");
            } else {
                System.out.println("rectangle");
            }

        }
    }

    public static void charOrNot() {
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
}
