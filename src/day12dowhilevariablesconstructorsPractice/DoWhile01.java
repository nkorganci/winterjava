package day12dowhilevariablesconstructorsPractice;

import java.util.Scanner;

public class DoWhile01 {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a = 0;

	do {
	    System.out.println("Write a number: ");
	    a = scanner.nextInt();
	    if (a % 2 == 0) {
		System.out.println("you won");
	    } else {
		System.out.println("try again");

	    }

	} while (a % 2 != 0);

    }

}
