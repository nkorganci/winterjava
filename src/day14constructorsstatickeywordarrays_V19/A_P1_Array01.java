package day14constructorsstatickeywordarrays_V19;

import java.util.Arrays;

public class A_P1_Array01 {

    public static void main(String[] args) {

	// I need to create array object.Stored in heap memory.
	int array1[] = new int[5];

	// FIRST WAY
	array1[0] = 2;
	array1[1] = 44;
	array1[2] = 43;

	System.out.println(Arrays.toString(array1));
	// toString() method is static because i can access via Array class.
	// there are static, non-static and variables.

	System.out.println(array1);
	// It will print reference of array.

	// SECOND WAY
	int array2[] = { 2, 3, 4, 5 };
	System.out.println(Arrays.toString(array2));

	// update an array index
	array2[0] = 99;
	System.out.println(Arrays.toString(array2));

	// Update all array elements to Joe

	for (int i = 0; i < array2.length; i++) {
	    array2[i] = 1;
	}
	System.out.println(Arrays.toString(array2));

	// Print array elements one by one
	for (int i = 0; i < array2.length; i++) {
	    System.out.print(array2[i] + " ");

	}

	// QUESTION: Did not work.
//	int j = 0;
//	do {
//	    System.out.print(array2[j] + " ");
//	    j++;
//	} while (j < array2.length);

	// How to find sum of the

	int sum = 0;

	for (int n = 0; n < array2.length; n++) {
	    sum = sum + array2[n];

	}
	System.out.println("Sum of the array elements is: " + sum);

	// EXAMPLE:Replace the "*" for the character all "a" in array3
	String str[] = { "jja", "Jab", "jca" };
	for (int i = 0; i < str.length; i++) {
	    str[i] = str[i].replace("j", "*");
	}
	System.out.println(Arrays.toString(str));

    }

}
