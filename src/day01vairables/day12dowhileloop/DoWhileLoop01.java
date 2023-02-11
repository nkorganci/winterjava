package day01vairables.day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

    }

    /*
     * Ask user to enter an integer If the integer is even print on the console �You
     * won!� Otherwise ask user to enter another integer
     */
    public static void even() {
	Scanner scanner = new Scanner(System.in);
	int num = 0;

	do {
	    System.out.println("write a number: ");
	    num = scanner.nextInt();

	    if (num % 2 == 0)
		System.out.println("You won!");

	} while (num % 2 != 0);

    }
}
