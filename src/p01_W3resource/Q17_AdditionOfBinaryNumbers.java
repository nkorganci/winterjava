package p01_W3resource;

import java.util.Scanner;

public class Q17_AdditionOfBinaryNumbers {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first binary number: ");
	String a = input.next();

	System.out.println("Enter the second binary number: ");
	String b = input.next();

	int b1 = Integer.parseInt(a, 2);
	int b2 = Integer.parseInt(b, 2);

	int b3 = b1 + b2;
	int b4 = b1 - b2;

	System.out.println(Integer.toBinaryString(b3));
	System.out.println(Integer.toBinaryString(b4));

    }

}
