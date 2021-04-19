package day41javadeveloper.Q107;

public class Test {
	
	/* ANSWER C Hello WOrld
	 * 
	 * What is the result?
	A. The compilation fails at line 9. 
	B. The compilation fails at line 2. 
	C. Hello World
	D. The compilation fails at line 8.
	 * 
	 */
	
	private static class Greet{
		
		private void print() {
			System.out.println("Hello World");
		}
		
	}
	
	public static void main(String[] args) {
		
		Greet i = new Greet();
		i.print();
		
	}
	

}
