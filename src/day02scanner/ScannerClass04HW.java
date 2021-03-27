package day02scanner;

import java.util.Scanner;

public class ScannerClass04HW {

	public static void main(String[] args) {
		
		
		
//		1)Type a program which calculates the area and the perimeter of a circle
//	whose radius is entered by user. (Use float)
//	Hint 1: Take pi number as 3.14159
//	Hint 2: Area of a circle is 3.14159 x radius x radius
//	Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
//	Hint 4: To get float, use nextFloat()


		Scanner scan = new Scanner(System.in);
		System.out.println("Please write the radius of circle");
		
		float radius = scan.nextFloat();
		float area = (float)(3.14 * radius * radius);
		
		System.out.println("Area of circle is: " + area);
		
		
//	2)Type a program which calculates the perimeter of a triangle whose
//	Side lengths are entered by user. (Use byte)
//	Hint 1: Perimeter of a triangle is a + b + c
//	Hint 4: To get byte, use nextByte()
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Write first length");
		byte a = scan1.nextByte();
		
		System.out.println("write 2nd length");
		byte b = scan1.nextByte();
		
		System.out.println("Write 3rd length");
		byte c = scan1.nextByte();
		
		System.out.println("addition of triangle lengths: " + (a + b + c));
		
		
		
//	3)Type a program which converts the mile to kilometer. Mile value will be
//	entered by user. (Use double)
//	Hint 1: km = mile x 1.6
//	Hint 2: To get double, use nextDouble()
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Write the value of mile");
		
		double mile = scan2.nextDouble();
		System.out.println("1 mile is equal to = " + 1.6*mile + "km");

		
		
//	4)Type a program which converts the hours to seconds. Hours value will be
//	entered by user. (Use long)
//	Hint 1: second = hour x 60 x 60
//	Hint 2: To get long, use nextLong()

	}

}
