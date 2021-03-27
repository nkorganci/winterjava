package day04ififelseifthenelse;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfElse02 {

	public static void main(String[] args) {
		// ask user to enter a character is alphabet or number or another thing.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Write a character");
		char ch = scanner.next().toLowerCase().charAt(0);

		if (ch <= 'z' || ch >= 'a') {
			System.out.println("It is from alphabet");

		} else {
			System.out.println("it is not from alphabet");
		}
	}

}
