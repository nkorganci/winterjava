package day06nestedifternaryswitch;

import java.util.Scanner;

public class L03_Ternary03 {

    public static void main(String[] args) {

    nestedTurnery();

    }
    public static void nestedTurnery(){

        /*
        if an integer is not negative and less than 10 , print " integer"
        else " negative can not be integer"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number: ");
        int a = scan.nextInt();

        System.out.println( (a>=0)? ((a>=10)?("integer is not digit"):("integer is digit")) : ("negative can not be a digit"));

    }
    public static void ternary(){
        //1st Question: Write a program which checks whether it has 3 digits or not.
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int a = inputScanner.nextInt();

        String result = (a > 99 && a < 1000) || (a < -99 && a > -1000) ? "It has 3 digits" : "It has no 3 digits";
        System.out.println(result);

        // 2nd Questions: Write a program which chects whether word has 2 character or not.

        System.out.println("Write a text");
        String iString = inputScanner.next();
        int n = iString.length();

        String resultString = n == 0 ? "It has 2 char" : "No 2 char";
        System.out.println(resultString);
    }
}
