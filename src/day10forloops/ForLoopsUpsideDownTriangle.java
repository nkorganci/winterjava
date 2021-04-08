package day10forloops;

import java.util.Scanner;

public class ForLoopsUpsideDownTriangle {

    public static void main(String[] args) {
	// upside down drawTriangle();

	//drawTriangle();

    }

    public static void drawTriangle() {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter an integer");

	int s = scanner.nextInt();

	for (int i = s; i > 0; i--) {

	    // Create a loop for spaces
	    for (int j = 0; j < s - i; j++) {
		System.out.print(" ");

	    }
	    // Create a for-loop for"* "
	    for (int k = s; k > s - i; k--) {
		System.out.print("* ");

	    }
	    System.out.println();

	}
	scanner.close();

    }


}
