package day03wrapperclassconcatenatelogicaloperators;

public class Concatenation01 {

	public static void main(String[] args) {
		// Joining strings
		
		String s1 ="Ali";
		String s2 = "can";
		
		System.out.println(s1 + " " + s2);
		
		int a = 5;
		int b = 7;
		String s3 = "Java";
		
		System.out.println(a + s3);  // java start from left to write, 5java
		System.out.println(s3 + a);  // java start from left to write, java5
		
		System.out.println(a + b + s3);
		
		System.out.println(s3 + a*b);
		
		//By using following variables
		
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		
		System.out.println(numA*numB + "" + (numB-numA) +  str1 + (numA-numB));
		
		
		
		
		
		
		

	}

}
