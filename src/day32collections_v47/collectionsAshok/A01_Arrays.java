package day32collections_v47.collectionsAshok;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A01_Arrays {

    //1 Primitive data types: byte, short , int, long float, double, char, boolean
    //2 Reference data types: Class, String, Array...
    public static void main(String[] args) {

    //asList() --> to convert asList, array should be reference type, not primitive type

        //1 arrays to list
        int [] o1 = {1,3,4};
        List o1List= Arrays.asList(o1);
        System.out.println("o1 int asList " + o1List);// Printed as reference
        System.out.println("Arrays.aslist " +Arrays.asList(o1));



        //2 List print
        List<String> list = new ArrayList<String>();
        list.add("hi");
        list.add("bye");
        System.out.println(list);

        //2
        Integer [] o2 = {4,2,3};
        List<Integer> o2List = Arrays.asList(o2);

        //3 binarySearch
        int intArr[] ={2,4,1};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        int intKey=1;
        System.out.println(intKey +" found at " + Arrays.binarySearch(intArr,intKey));

        //4 Arrays compare
        int a[] ={2,4,1};
        int b[] ={2,4,1};
        System.out.println(Arrays.compare(a,b));

        //Array sort
        System.out.println();


    }

    public void arraysIntroduction(){
        // Arrays and Limitations
        int [] num  = new int[2]; // size is fixed and only one type is stored
        int [] num1 = {2,3};
        //Adding elements into the array
        Array.setInt(num1,0,11);// replaces the value at a given index

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
