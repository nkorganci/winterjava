package day27exceptions_V40;

import day02scanner.ScannerClass01;

import java.util.Scanner;

public class L01_Exception01 {
    public static void main(String[] args) {

//        nullPointerException();
//        arrayIndexOutOfBoundsException();
//        classCastException();
//        numberFormatException();
        convertStringToInteger();

    }

    public static void nullPointerException() {
        String a = "";
        System.out.println(a.length());//no error

        // If you try to do unappropriate actions with a "null" object you will get "NullPointerException"
        String b = null;//null is an object, we can not get number of characters
        System.out.println(b.length());//NullPointerException is a Run Time Exception.
    }

    public static void arrayIndexOutOfBoundsException() {
        int arr[] = {3, 4, 5, 6};
        System.out.println(arr[4]);//ArrayIndexOutOfBoundsException: RTE, For non-existing indexes in arrays
    }

    public static void classCastException() {
        Object i = 70;//Object class is wider than String, we need to explicit narrowing.
        String s = (String) i;// ClassCastException: RTE, Integer cannot be cast to class java.lang.String
        // If a data type can not be cast to another data type.
    }

    public static void numberFormatException() {
        //parseInt() method in Integer wrapper class converts String to integer.
        int a = Integer.parseInt("123");
        System.out.println(a + 2);//123

        int b = Integer.parseInt("abs");//NumberFormatException: RTE, if you want to convert non-digit String to Integer
        System.out.println(b + 2);
    }

    public static void convertStringToInteger() {
        /*
        Get a String from user
	 	Convert it to an integer
	 	Return the integer after multiplying by 2
	 	Your code should not be blocked for any String
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to convert to integer");
        String str = scan.nextLine();

        int a = 0;
        try {
            a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println(str + "can not be converted to integer");
        }

    }

    public static void getElement() {
        /*
        Display an array to user
	 	Ask the user to select any element by using order number
	 	Print the selected element on the console
	 	Your code should not be blocked for any order number
         */

        String str[] = {"a", "c", "e", "k"};
        int orderNumber=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Select any element by using order number from the given array {a, c, e, k}");
        int orderNum = scan.nextInt();



        String el = "";

        try {
            el = str[orderNum-1];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You entered a non-existing order number...");
        }

       // return el;



    }
}
