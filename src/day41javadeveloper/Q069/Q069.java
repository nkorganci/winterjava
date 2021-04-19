package day41javadeveloper.Q069;

import java.util.List;

public class Q069 {

	public static void main(String[] args) {
		List<Integer>even=List.of(2,3);
		
//		even.add(0,-1);
//		even.add(0,-2);
//		even.add(0,-3);
		System.out.println(even);

//		even.add(1);
//		System.out.println(even);

	}

}

/*What is the output?
A. The compilation fails.
B. [-1, -2, -3]
C. [-3, -2, -1]
D. A runtime exception is thrown.

*
*Cevap D.  List.of() demek Returns an unmodifiable list containing zero elements. bu yuzden cevap D

*
*/
