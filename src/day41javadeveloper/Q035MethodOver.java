package day41javadeveloper;

public class Q035MethodOver {
	
	public void analyze(Object[] o) {
		System.out.println("I am an object array");
	}
	
	public void analyze(long[] l) {
		System.out.println("I am an long array");
	}
	
public void analyze(Object o) {
		System.out.println("I am an object");
	}

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		new Q035MethodOver().analyze(nums);  //line 1
		
	}
}


// What is the output?    ANSWER:D

//A. I am an object array
//B.The compilation fails due to an error in line1
//C.I am an array
//I am an object