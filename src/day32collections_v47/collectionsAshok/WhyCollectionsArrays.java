package day32collections_v47.collectionsAshok;

import java.util.Arrays;

public class WhyCollectionsArrays {

    //1 Primitive data types: byte, short , int, long float, double, char, boolean
    //2 Reference data types: Class, String, Array...
    public static void main(String[] args) {

        // Arrays and Limitations
        int [] num  = new int[2]; // size is fixed and only one type is stored
        int [] num1 = {2,3};

        //Example 2: Print an Array using standard library Arrays
        System.out.println(num1);// Only reference will be printed
        System.out.println(Arrays.toString(num1));// numbers in array is printed
//        System.out.println(Arrays.deepToString(num1)); // 1D array deepToString need object type

        //Example 1: Print an Array using For loop
       for(int i=0;i<num1.length;i++){
           System.out.println(num1[i]);
       }

       for(int numbers: num1){
           System.out.println("for " + numbers);
       }

        // Multi-array
        int [][] num2= {{2,3,4},{45,4643,}};
        System.out.println("2D Array " + Arrays.toString(num2));// Printed only references
        System.out.println("2D Array2 " + Arrays.deepToString(num2));// Print 2D

        Object [] num3 = {2,3};
        System.out.println("1d array "+ Arrays.deepToString(num3));// If data type is object, you can use


    }
}
