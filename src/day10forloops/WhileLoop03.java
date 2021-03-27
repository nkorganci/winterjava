package day10forloops;

import java.util.Scanner;

public class WhileLoop03 {

    public static void main(String[] args) {
	factorial();

    }

    /*
     * get a number from a user and calculated its factoriel.
     * 
     */

    public static void factorial() {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Write a number to calculate factorial: ");
	int d = scanner.nextInt();
	int i = 1;
	int result = 1;

	while (i <= d) {
	    result = result * i;
	    i++;
	}

	System.out.print(result);
	scanner.close();

    }

}
