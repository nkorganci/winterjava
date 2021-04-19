package day41javadeveloper;

public class Q026 {

	public static void main(String[] args) {
		char [][] arrays= {{'a','d'},{'b','e'},{'c','f'}};
		
	for(char []xx:arrays) {
		for(char yy:xx) {
			System.out.print(yy);
		}
		System.out.print(" ");
	}


	}	

}
/*
What is the result?
A. ab cd ef
B. An ArrayIndexOutOfBoundsException is thrown at runtime. C. The compilation fails.
D. abc def
E. ad be cf
 Cevap E 
 */
