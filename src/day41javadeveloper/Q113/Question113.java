package Q113;

import java.util.ArrayList;

public class Question113 {

	
	/*ANSWER D
	 * 
	 * 
	 * 
	Given:
		var data = new ArrayList<>(); 
		data.add(“Peter”); 
		data.add(30); 
		data.add(“Market Road”); 
		data.set(1, 25); 
		data.remove(2);
		data.set(3, 1000L); 
		System.out.print(data); 
		What is the output?
			A. [Market Road, 1000]
			B. [Peter, 30, Market Road]
			C. [Peter, 25, null, 1000]
			D. An exception is thrown at run time.

	*/
	
	public static void main(String[] args) {
		
		
		var data = new ArrayList<>(); 
		data.add(“Peter”); 
		data.add(30); 
		data.add(“Market Road”);
		data.set(1, 25); 
		data.remove(2);
		data.set(2, 1000L); 
		System.out.print(data);
		

	}

}
