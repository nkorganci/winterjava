package day41javadeveloper;

import java.util.Arrays;

public class Q006ArrayMismatchCompare {

	public static void main(String[] args) {
		int [] secA= {2,4,6};
		int [] secB= {2,4,8};
		int res1=Arrays.mismatch(secB, secA);
		int res2=Arrays.compare(secB, secA);
		System.out.println(res1+" : "+res2);
/*
 * What is the result?
A. -1 : 2 
B. 2 : -1 
C. 2 : 3 
D. 3 : 0

*mismatch methodu ilk eslesmeyen elemanin indexini print eder.
*The compare() method in Java compares two class specific objects (x, y) given as parameters. It returns the value:

0: if (x==y)
-1: if (x < y)
1: if (x > y)
*/
	}

}
