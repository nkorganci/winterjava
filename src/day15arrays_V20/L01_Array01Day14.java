package day15arrays_V20;

import java.util.Arrays;

public class L01_Array01Day14 {
	/*
	1- To store multiple values , we need "Arrays"
	2- An array can have just a single data type
	3- Arrays accept just "primitive"  data types as elements
	4- If you add Strings to Array, it store their references not String.
	5- Arrays are objects which can store multiple variables.
	6- Arrays are objects , use NEW key word always.
	7- Arrays.toString(array1)// toString() method is static because I can access with Array class.
	8- String use length(), array use length, not parenthesis.

	 */

    public static void main(String[] args) {
        replaceAllChar();
    }

    public static void createArrayToString() {
        /*
        static String toString(int[] a)
        Returns a string representation of the contents of the specified array.
        The string representation consists of a list of the array's elements, enclosed in square brackets ("[]")
         */

        int array1[] = new int[6];// Created array[] object not element
        System.out.println(array1);// Return  [I@e9e54c2  which is the reference of the Array object.
        // Arrays contain object, not elements

        System.out.println(Arrays.toString(array1));// Return elements [0, 0, 0]

        //Write the index number and its assignment
        array1[1] = 11;
        array1[2] = 22;
        array1[5] = 22;
        array1[2] = 22;
        System.out.println(Arrays.toString(array1));

    }

    public static void createArrayShorterWay() {

        String array2[] = {"a", "b", "c"};
        System.out.println(Arrays.toString(array2)); //[a, b, c]
    }

    public static void updateAddArrayElement() {
        String array2[] = {"a", "b", "c"};
        System.out.println(Arrays.toString(array2)); //[a, b, c]
        array2[1] = "aa";
        System.out.println(Arrays.toString(array2));

        //array2[4]= "Hi";// Does not complain but return RTE, Index 4 out of bounds for length 3
        System.out.println(Arrays.toString(array2));
    }

    public static void updateAllElements() {
        String array2[] = {"a", "b", "c"};
        System.out.println(Arrays.toString(array2)); //[a, b, c]

        // need to start with 0
        for (int i = 0; i < array2.length; i++) {

            array2[i] = "Hi";

        }
        System.out.println(Arrays.toString(array2));

    }

    public static void printAllArrayElements() {
        String array2[] = {"a", "b", "c"};
        System.out.println(Arrays.toString(array2)); //[a, b, c]

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);// Return string, print elements as String, a, b , c
        }
    }

    public static void findSumOfIntArrayElements() {
        int int1[] = {1, 2, 3};

        int i = 0;
        int sum = 0;
        while (i < 3) {
            sum = sum + int1[i];
            i++;
        }
        System.out.println(sum);
    }

    public static void replaceAllChar() {
        String array2[] = {"Joy", "Joy", "Joy"};

        int i = 0;

        do {
            array2[i] = array2[i].replace("J", "*");
            i++;

        } while (i < array2.length);
        System.out.println(Arrays.toString(array2));// [*oy, *oy, *oy]

    }
}
