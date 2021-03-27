package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {

	public static void main(String[] args) {
		
		/*
		 ask user his/her full name, spouse's name, address, write all in consoule
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your full name please");
		String fullName = scan.nextLine();

		
		System.out.println("Write your spouse's name");
		String spouseName = scan.next();
		
		
		scan.nextLine(); // after using nextline(), if you use any other method, you type scan.nextLine(); again.
		
		System.out.println("Write your address please");
		String address = scan.nextLine();
		
		String spousesName;
		System.out.println("Your name is " + fullName + "Your spouses name is " + 
		spouseName  + "Your address is " + address);
		

	}

}
