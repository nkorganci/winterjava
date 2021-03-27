package day16multidimensionalarrays_V21;

import java.util.Arrays;

public class MutiDimArrays01 {
    // QUESTION:Why arrays need toString method?
    // Arrays can not have non primitive data
    // Arrays use references of non primitive data types
    // Array is an object
    // 1) ArrayLists are flexible classes in size.
    // 2) ArrayLists can not store multiple data types.
    // 3) ArrayLists store non-primitive data types.
    // 4) ArrayLists are updated version of Arrays.
    // 5) If array is given, convert it to arrayList to use

    public static void main(String[] args) {
	// multiDimensionalArray();
//	sumOfElements();
//	sumOfFirstElements();

    }

    public static void multiDimensionalArray() {
	int arr[][] = new int[3][2];// two dimensional array has two bracket.If All of them must has 2 items.

	System.out.println(Arrays.deepToString(arr));// deepToString is used to print for 2 dimensional array.

	int arr1[][] = { { 7, 2, 2 }, { 3, 6 }, { 9 } }; // If inner arrays have different number of elements.
	System.out.println(arr1[0][1]);// How to print a specific element.console show 2.

	arr1[0][1] = 88;// How can I update elements.

	System.out.println(Arrays.deepToString(arr1)); // How to PRINT MULTIDIMENSIONAL ARRAY

	System.out.println(Arrays.toString(arr1[0]));// How to PRINT first ARRAY

	System.out.println(arr1[0][1]);// print an element I can PRINT directly because it is a STRING
    }

    public static void sumOfElements() {// Sum of the all elements

	int num[][] = { { 2, 3 }, { 9 }, { 3, 5 } };
	int sum = 0;

	for (int i = 0; i < num.length; i++) {
	    for (int j = 0; j < num[i].length; j++) {
		sum += num[i][j];

	    }
	}
	System.out.println(sum);

    }

    public static void sumOfFirstElements() {

	int sum = 0;
	int num[][] = { { 2, 3 }, { 9 }, { 3, 5 } };
	for (int i = 0; i < num[0].length; i++) {
	    sum += num[0][i];
	}
	System.out.println(sum);

    }

    public static void sumOfElements2() {
	// 1.Sum of the single array elements
	int arr[] = { 2, 3, 4 };
	int sumArr = 0;
	for (int i = 0; i < arr.length; i++) {
	    sumArr = sumArr + arr[i];
	}
	System.out.println(sumArr);

	// 2.Sum of first array in multidimensional array.

	int arr1[][] = { { 1, 2, 4 }, { 1, 2 }, { 1, 2, 3 } };
	int sumArr1 = 0;
	for (int i = 0; i < arr1[0].length; i++) {
	    sumArr1 = sumArr1 + arr1[0][i];

	}
	System.out.println(sumArr1);

	// 3.Sum of all arrays in multidimensional array.

	int sumArr2 = 0;
	for (int i = 0; i < arr1.length; i++) {
	    for (int j = 0; j < arr1[i].length; j++) {
		sumArr2 = sumArr2 + arr1[i][j];

	    }
	    System.out.println(sumArr2);
	}

    }

    public static void printBee() {
	// 1- Print "Bee" on the console
	String arr[][] = { { "A", "B" }, { "K", "e" }, { "L", "X", "e" } };

	String arrArray = "";

	for (int i = 0; i < arr.length; i++) {

	    arrArray = arrArray + arr[i][arr[i].length - 1];
	}
    }

    public static void printBee1() {
	// 3- Print "Bee" on the console
	String arr2[][] = { { "A", "B", "S" }, { "K", "R", "e" }, { "L", "X", "e" } };

	String bee = "";

	for (int i = 0; i < arr2.length; i++) {
	    for (int j = 0; j < arr2[i].length; j++) {
		if (arr2[i][j].equals("B")) {
		    bee = bee + arr2[i][j];
		    break;
		    // Break start the loop again, does not go other loop.
		} else if (arr2[i][j].equals("e")) { // QUESTION: Can i use again if , why else if???
		    bee = bee + arr2[i][j];
		    break;
		} // QUESTION: Why there is no ELSE in here???

	    }

	}
	System.out.println(bee);

    }

    public static void printBee2() {// 2 or more chars can be found on same array
	String arr[][] = { { "A", "B", "e", "M" }, { "s", "K", "Z" }, { "Z", "X", "e", "S" } };
	// Print "Bee" on the console.

	String bee = "";

	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
		if (arr[i][j].equals("B")) {

		    bee += arr[i][j];
//		    break;

		} else if (arr[i][j].equals("e")) {
		    bee += arr[i][j];
//		    break;

		} else if (arr[i][j].equals("e")) {
		    bee += arr[i][j];
//		    break;
		}
	    }
	}

    }

    public static void multiplicationOfFirstElements() {
	// 2- Find the multiplication of first elements of each array.
	int prod = 1;
	int arr1[][] = { { 3, 2, 4 }, { 1, 2 }, { 1, 2, 3 } };

	for (int i = 0; i < arr1.length; i++) {
	    prod = prod * arr1[i][0];

	}
	System.out.println(prod);
    }

}
