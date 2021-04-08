package day10forloops;

import java.util.Scanner;

public class ForLoopFactoriel {

    public static void main(String[] args) {
	//productOfInt();


    }

    public static void productOfInt() {
	{
	    // multiply starting integer and ending integer for a given number.
	    // calculate the factorial of given numbers.
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("enter the starting integer value: ");
	    int num1 = scanner.nextInt();
	    System.out.println("enter the ending integer value: ");
	    int num2 = scanner.nextInt();

	    int product = 1;

	    for (int i = num1; i <= num2; i++) {
		product = product * i;
	    }
	    System.out.println(product);
	    scanner.close();

	}

    }

}
