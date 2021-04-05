package day05ifelseifCheckConditions;

import java.util.Scanner;


public class IfElseStatment06 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter annual salary, if the salary is more than or equal to
		 * $80.000 output will be �I accept the offer�, if the salary is between $60.000
		 * and $80.000 out put will be �I negotiate to increase�, otherwise output will
		 * be �I do not accept the offer.�
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("What do you offer to me: ");
		double salary = scanner.nextDouble();
		
		scanner.close();

		if (salary < 0) {
			System.out.println("I am not a slave :(");
		} else if (salary < 60000) {
			System.out.println("I do not accept the offer");
		} else if (salary < 80000) {
			System.out.println("I do not accept the offer");
		} else {
			System.out.println("I accept");
		}
		
		//scanner.close();

	}
}
