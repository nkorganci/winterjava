package day41javadeveloper.Q093;

public class Main {
	
	public static void greet(String ...args) {
		System.out.println("hello ");
		for(String arg :args) {
			System.out.println(arg);
		}
	}

	public static void main(String[] args) {
		Main c= null;
		c.greet();
		

	}

/*What is the result?
A. NullPointerException is thrown at line 4.
B. NullPointerException is thrown at line 10. 
C. A compilation error occurs.
D. Hello
Cevap D
*
*/
}
