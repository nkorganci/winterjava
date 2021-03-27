package day02scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		//          Explicit Narrowing: If you assign a large data type to a small data type,
		//          type casting cannot be done by Java automatically.
		//          You should take the responsibility and type the casting explicitly.
		
		int i2 = 120;
		short s1 = (short)i2;
		System.out.println(i2);
		System.out.println(s1);
		
		float f1 =2.3f;
		float f2 = 2.3F;
		float f3 = (float)2.3;
		double f4 =2.3;
		
		short s2 = 125;
		byte b4 = (byte)s2;
		System.out.println(s2); //255
		System.out.println(b4); //
		
		int i3 = 5;
		int i4 = 2;
		System.out.println(i3/i4);  // int should be integer so 2
		
		int i5 = 5;
		double d1 = 2;
		System.out.println(i5/d1);// bigger will take last value
		
	
		
		

	}

}
