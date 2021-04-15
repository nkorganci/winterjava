package day37oca18.q1_10;

public class Q002 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = (j +=i) / 5;		// k = 30/5 =6       
		// (j = j+i) = (j = 30)  in parentheses j is equalized to 30
		System.out.print(i + " : " + j + " : " + k);
	}
}
