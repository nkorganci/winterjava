package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
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
			}else {
				System.out.println("rectangle");
			}
					
			
		}

	}

}
