package day10forloops;

import java.util.Scanner;

public class ForLoopDrawTriangle {

    public static void main(String[] args) {
        //drawTriangle();

    }

    public static void drawTriangle() {

//	       *
//	      ***
//	     *****

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int s = scanner.nextInt();

        for (int j = 1; j <= s; j++) {
            // To draw " "
            for (int i = s - j; i > 0; i--) {
                // Dont use "println" because, you should print spaces in the same line
                System.out.print(" ");
            }
            // o draw "* "
            for (int k = 1; k <= j; k++) {
                // Do not use "println" because, you should print"* " in the same line
                System.out.print("* ");
            }
            // To move pointer to next line
            System.out.println();

        }
        scanner.close();
    }

}
