package day05ifelseifCheckConditions;


import java.util.Scanner;

public class IfElseStatement01 {

    /*
    && AND : stops if one of the condition is false
    &      : Checks all condititions
     */

    public static void main(String[] args) {

        ifElseAge();

    }


    public static void ifElseAge() {
		/*
		if the age is between 15 and 65, you can work.
		Otherwise you can not work.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Please enter a valid data");

        } else if (age <= 65 && age >= 18) {
            System.out.println("You can work");
        } else {
            System.out.println("You can not work");
        }


    }
}
