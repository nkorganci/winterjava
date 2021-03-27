package day02scanner;

import java.util.Scanner;

public class ScannerClass02 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("write the left line length");
		double num = scan.nextDouble();
		System.out.println("aree = " + num);
		System.out.println("length = " + 4*num);
		/*
		 Type a program which calculates the area and the perimeter of a square
		whose side length is entered by user.
		Hint 1: Area of a square is length x length
		Hint 2: Perimeter of a square is 4x length
		 */
	}

}
