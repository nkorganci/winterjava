package day06nestedifternaryswitch;

import java.util.Scanner;

public class L02_Ternary01 {
	/*
	1- In ternary, do not write System.out.println(), it will not print.
	because it does not return anything, void println(String x)

	2- You need to assing ternary to  a variable depends on out put of ternary.

	 */

    public static void main(String[] args) {

        ternary03();


    }

    public static void ternary01() {
        //1st Example: If input is even , write it is even if input is odd , write it is odd
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");
        int a = input.nextInt();

        String result = (a % 2 == 0 ? "Even number" : " Odd number");
        System.out.println(result);

        //2nd Example: ask 2 inter, write the bigger one
        System.out.println("Write 2 numbers: ");
        int b = input.nextInt();
        int c = input.nextInt();

        int z = b > c ? b : c;
        System.out.println(z);
    }// Even odd nubmer, which one is bigger

    public static void ternary02() {
        /*
         * Write a program which returns absolute value
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");
        int a = input.nextInt();

        int result = a < 0 ? a * (-1) : a;
        System.out.println("Absolute value is: " + result);

    }// Absolute value

    public static void ternary03() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write length: ");
        int a = input.nextInt();

        System.out.println("Write width: ");
        int b = input.nextInt();

        //1- without condition
        String result = a == b ? "Square" : " Rectangle";
        System.out.println("This shape is " + result);

        //2-Check the initial condition
        String result2 = a > 0 && b > 0 ? (a == b ? "Square" : " rectangle") : ("Enter a valid number");

        //You can write turnery directly inside of the sout.
        System.out.println(a > 0 && b > 0 ? (a == b ? "Square" : " rectangle") : ("Enter a valid number"));
        System.out.println(result2);

    }

}
