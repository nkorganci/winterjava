package day41javadeveloper.Q057;

public class Q057 {

	public static void main(String[] args) {
		//           n       n
		// M=P(r(1+r)  /((1+r)  - 1))
		
		double m;         //montly payment
		double r= 0.05/12;//montly interest
		int p =100_000;   //princibal
		int n=180;         //number of payment

	}
	
	/*
 How can you code the formula?
A. m = p * (r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1)); 
B. m = p * ((r * Math.pow(1 + r, n) / (Math.pow(1 + r, n)) - 1)); 
C. m = p * r * Math.pow(1 + r, n) / Math.pow(1 + r, n) - 1;
D. m = p * (r * Math.pow(1 + r, n) / Math.pow(1 + r, n) - 1);
	 * 
	 * 
	 * Cevap kesin A 
	 * */

}
