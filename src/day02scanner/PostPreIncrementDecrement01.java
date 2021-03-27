package day02scanner;

public class PostPreIncrementDecrement01 {

	public static void main(String[] args) {
		
		//Post increment means increase at the end of the statement
		int x = 12;
		
		System.out.println(x++); // printed 12, mode the value of 13
		System.out.println(x); // print 13
		System.out.println(x = x + 1);
		
		//pre increment means increase before the name of the variable
		
		System.out.println(++x); // x = 14, printed 14
		
		//post decrement means decrease at the end of the statment
		System.out.println(x--); // 14
		
		
		

	}

}
