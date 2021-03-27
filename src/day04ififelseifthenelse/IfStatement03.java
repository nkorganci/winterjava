package day04ififelseifthenelse;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Get the date from the user, if user entered weekday, output is "Weekday"
		 Otherwise "Weekend"
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a day name to ckeck if it is weekday or not");
		String dayName = scanner.next().toLowerCase();
		// Note: to compare strings, DO NOT USE "==". Use "equals()" method. Equal() does not check references.
		// == checks both value and reference.
		
		if (dayName.equals("monday") || dayName.equals("tuesday")) {
			System.out.println("Weekday");
			
		}
		if (!dayName.equals("tuesday") || !dayName.equals("monday")) {
			
			System.out.println("not weekend");
			
		}
		
		

	}

}
