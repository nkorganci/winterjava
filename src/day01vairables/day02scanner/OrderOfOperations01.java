package day01vairables.day02scanner;

public class OrderOfOperations01 {

    public static void main(String[] args) {
				
		/* 1) Do exponential operations
		     2) Do the operations inside the parenthesis
		    3) Multiplication and division
		 4) addition and subtraction
		 */



        int result1 = 3 + 2*( 6 -2)/3;

        /*
         What is the reminder of 12 when you divide it by 2
         1- Modulus operator operator (%) is used to find reminder
         2- modules is used find digit numbers of given value.
         */


        System.out.println(17 % 3);
        System.out.println(-17 % 3);
        System.out.println(17 % -3);
        System.out.println(-17 % -3);

       //What is the last digit of the number c?
        int c = 12345;
        int lastDigit = c%10;
        System.out.println(lastDigit);// Module 10 always gives the last digit.



    }

}
