package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseCharOrNumber01 {

    public static void main(String[] args) {

	name();

    }

    /*
     * 1ST QUESTION: Ask user to enter a character, then check whether the character
     * is number or alphabet.
     */
    public static void name() {

	Scanner input = new Scanner(System.in);
	System.out.println("Write a character: ");

	char ch = input.next().charAt(0);
	if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z')) {
	    System.out.println(ch + " is an alphabet.");
	} else if (ch < '9' && ch >= '0') {
	    System.out.println(ch + " is a number.");
	} else {
	    System.out.println(ch + " is not a number or alphabet");

	    input.close();
	}

    }
    
    
    
     

}
