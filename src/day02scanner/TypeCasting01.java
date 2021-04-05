package day02scanner;

public class TypeCasting01 {

	public static void main(String[] args) {

		/*
		byte<short<int<long<float<double
		 */
		/*
		Explicit Narrowing: If you assign a large data type to a small data type,
		type casting cannot be done by Java automatically.
		You should take the responsibility and type the casting explicitly.
		 */


		//1- If you assing a small data to a large data type, type casting is done automatically by java
		int i1 = 120;
		long l1 = i1;// Widening Casting (Implicit) – Automatic Type Conversion


		//2- If you assing large data type to small data type, you should take the responsibility and cast.
		long l2 = 120;
		int i2 = (int)l2;// Narrowing Casting (Explicit) – Need Explicit Conversion

		short s1 = (short)i2;
		System.out.println(i2);
		System.out.println(s1);
		
		//3- "float" problem can be solved by 4 ways
		float f1 =2.3f;
		float f2 = 2.3F;
		float f3 = (float)2.3;
		double f4 =2.3;

		//4- Byte can be maximum 256, so short s2 is calculated according to modular of 256
		short s2 = 150;
		byte b4 = (byte)s2;
		System.out.println(s2); //255
		System.out.println("Byte is: " + b4); //


		//5- If you use different data types in mathmatical operations, the result data type will be the largest data type.
		int i3 = 5;
		int i4 = 2;
		System.out.println(i3/i4);  // int should be integer so 2
		
		int i5 = 5;
		double d1 = 2;
		System.out.println(i5/d1);// bigger will take last value
		

	}

}
