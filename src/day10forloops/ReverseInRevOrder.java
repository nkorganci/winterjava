package day10forloops;

import java.util.Scanner;

public class ReverseInRevOrder {

    public static void main(String[] args) {

	printStrInReverse();

    }

    /*
     * reverse the order of the letters
     */
    public static void printStrInReverse() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string in order to see reverse: ");
	String str = scanner.nextLine();

	for (int i = str.length() - 1; i >= 0; i--) {
	    System.out.print(str.charAt(i));
	}
	scanner.close();

    }

}
