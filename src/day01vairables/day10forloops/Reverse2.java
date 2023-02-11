package day01vairables.day10forloops;

import java.util.Scanner;

public class Reverse2 {

    public static void main(String[] args) {
        //printStrInReverse();
        review("Hiiisdf");
    }

    public static void printStrInReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in order to see reverse: ");
        String str = scanner.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.substring(i, i + 1);

        }

        if (str.equals(reverse)) {

            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");

        }
        scanner.close();

    }

    public static void review(String a) {

        String b = "";
        for (int i = (a.length() - 1); i >= 0; i--) {
            b= b+ a.substring(i,i+1);
        }
        System.out.println(b);




    }
}
