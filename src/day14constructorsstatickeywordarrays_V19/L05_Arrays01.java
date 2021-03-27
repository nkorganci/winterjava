package day14constructorsstatickeywordarrays_V19;

import java.util.Arrays;

public class L05_Arrays01 {

    // 1- To store multiple values, we need "Arrays"
    // 2- Arrays can store only one type of the data
    // 3- Arrays accept only "primitive data types" as elements.
    // 4- For String values, java take their reference in Stack strorage from Heap
    // memory. There is no string arrays.
    // 5- arrays are objects which stored in heap memory.
    // 6- We can use toString() method to get string representation of an object.
    // 7- Arrays are primitive, java created more functional ones like ArrayLists..

    public static void main(String[] args) {

	int array[] = new int[5];// number of items is 5.(0, 0, 0 , 0, 0)
	System.out.println(array); // array is an object, its reference stored at stack
	System.out.println(Arrays.toString(array)); // We need to use Arrays class to convert it String.

	// 1st Way to create and assign values.
	array[0] = -2; // 1 is the index number of 1st item, assigned to 11
	array[1] = 11;
	array[2] = 44;
	array[3] = 55;
	array[4] = 33;

	System.out.println(Arrays.toString(array));

	// 2nd way to create and assign values.

	String array1[] = { "Ali", "Can", "Ayse" };
	System.out.println(Arrays.toString(array1));

	// 1- How to update an element.

	array1[2] = "Fatma";
	System.out.println(Arrays.toString(array1));

	// 2- array1[4] = "Angie";
	// System.out.println(Arrays.toString(array1));// Will give run time error, it
	// contain only 4 elements, not 5th.

	// 3- Update all elements to "Joe"
	// String.length() has parenthesis. But Arrays.length has no parenthesis.

	// 4- How to print all array elements
	// Arrays length method is without parenthesis, but string has.
	for (int i = 0; i < array1.length; i++) {

	    array1[i] = "Joe";
	}
	System.out.println(Arrays.toString(array1));

	// 5- How to print one by one all element
	for (int i = 0; i < array1.length; i++) {

	    System.out.println(array1[i]);
	}

	// 6- How to find the sum of the all array elements

	int m = 0;
	int sum = 0;

	do {
	    sum = sum + array[m];
	    m++;

	} while (m < array.length);

	// 7- Replace "*" for all the character 'J' in array 1.

	for (int i = 0; i < array1.length; i++) {

	    array1[i] = array1[i].replaceAll("J", "*");// I can use replace too

	}
	System.out.println(Arrays.toString(array1));

    }

}
