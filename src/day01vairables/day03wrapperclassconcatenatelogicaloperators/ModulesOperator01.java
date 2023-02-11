package day01vairables.day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulesOperator01 {

    public static void main(String[] args) {
		/*
		 Ask user to enter 3 digit integer
		 Type a program to find the sum of the digits
		 For example; 345 ==> 3 + 
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a 3 digit integer");
        int a = scan.nextInt();
        int thirdDigit = a % 10;
        int secondDigit = (a / 10) % 10;
        int firstDigit = a / 100;

        System.out.println("Sum of the integers " + (firstDigit + secondDigit + thirdDigit));

    }

}
