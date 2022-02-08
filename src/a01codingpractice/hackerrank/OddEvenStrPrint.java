package a01codingpractice.hackerrank;

import java.util.Scanner;

public class OddEvenStrPrint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String even = "";
        String odd = "";

        for (int j = 0; j < num; j++) {
            String str = input.next();

            for (int i = 0; i < str.length(); i += 2) {
                System.out.print(str.charAt(i));
            }
            System.out.print(" ");
            for (int i = 1; i < str.length(); i += 2) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }


    }
}



