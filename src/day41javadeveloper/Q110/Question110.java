package day41javadeveloper.Q110;

import java.util.List;
import java.util.function.Function;

public class Question110 {
	
	/* ANSWER A
	 * 
	 * Which statement on line 1 enables this code to compile?
		A. Function<Integer, Integer> f = n −> n * 2; 
		B. Function<Integer> f = n −> n * 2;
		C. Function<int> f = n −> n * 2;
		D. Function<int, int> f = n −> n * 2;
		E. Function f = n −> n * 2;
	 * 
	 */
	
	

	public static void main(String[] args) {
		

		var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		//line1
		
		//Function<Integer, Integer> f = n −> n * 2; 
		// Function<Integer> f = n −> n * 2;
		// Function<int> f = n −> n * 2;
		//Function<int, int> f = n −> n * 2;
		//Function f = n −> n * 2;
		
		StringBuilder sb= new StringBuilder();
		for(int a: numbers) {
			
			sb.append(f.apply(a));
			sb.append(" ");
			
		}
		System.out.println(sb.toString());
		

	}

}
