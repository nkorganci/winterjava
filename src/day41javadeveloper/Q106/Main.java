package day41javadeveloper.Q106;

import java.util.Optional;

/*ANSWER C Duke
 * 
 * What is the output?
	A. null
	B. A NoSuchElementException is thrown at run time. 
	C. Duke
	D. A NullPointerException is thrown at run time.
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Optional<String> value = createValue();
		String str = value.orElse("Duke");
				System.out.println(str);
		}

	
	static Optional<String> createValue(){
		String s=null;
		return Optional.ofNullable(s);
	}
}
