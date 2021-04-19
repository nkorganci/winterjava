package day15arrays_V20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01_Array {
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

        /*
    1- int num[] = { 5,1, 2, 8 };
    2- Arrays.toStringReturns a string representation of the contents of the specified array.
	3- The main() method must be called from a static method only inside the same class.
    4- Equals is a method of Object class
    5- For objects we dont use "==" operator, array is an object
    6- If you want to use array method, you should start with Arrays.....

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

    public static void arrayGeneralInformation() {
        int num[] = {5, 1, 2, 8};
        System.out.println(Arrays.toString(num));

        // SORTING ARRAY
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        // Sorting in descending order

        int reNum[] = new int[num.length];

        for (int i = 0; i < reNum.length; i++) {
            reNum[i] = num[num.length - 1 - i];

        }
        System.out.println(Arrays.toString(reNum));

        // How to check if an element exist or not

        int num2[] = {1, 4, 2, 3};
        Arrays.sort(num2);
        System.out.println(Arrays.binarySearch(num2, 4));

    }

    public static void sortingAscendingArrayElements() {
        int num[] = {5, 1, 2, 8};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

    public static void sortingDescendingOrder() {
        /*
        1- Sort the elements in ascending order
        2- Use loop to add another Array for descending order.
         */

        int num[] = {5, 1, 2, 8};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int i = 0;
        int numNew[] = new int[num.length];
        while (i < num.length) {
            numNew[i] = num[num.length - 1 - i];
            i++;
        }
        System.out.println(Arrays.toString(numNew));

    }

    public static void checkIfElementExistBinarySearch() {

        /*
        Searches the specified array of ints for the specified value using the binary search algorithm.
        The array must be sorted (as by the sort(int[]) method) prior to making this call.
        If it is not sorted, the results are undefined.
        If the array contains multiple elements with the specified value, there is no guarantee which one will be found.
         */

        int num[] = {5, 1, 2, 8};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);

        System.out.println(Arrays.binarySearch(num, 2));
        ;// Return the index number of that number or element.
        System.out.println(Arrays.binarySearch(num, 55));
        ;// Return the order number of that number or element.


    }// int binarySearch(int[] a, int key)

    public static void checkIfArraysEqualFirstWay() {
        /*
        1- If two arrays are equal, same elements should be in same index.
         */
        int a[] = {5, 2, 6};
        int b[] = {5, 2, 6};
        int c[] = {5, 6, 2};

        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == c[i]) {
                count++;
            }

        }
        if (a.length != b.length) {
            System.out.println("Not equal");
        } else if (count == a.length) {
            System.out.println("equal");

        } else {
            System.out.println("not equal");
        }

    }

    public static void checkIfArraysEqualFirstWay1() {// Check if array a equals to b
        int a[] = {5, 2, 6, 3};
        int b[] = {5, 2, 6};
        int c[] = {5, 6, 2};

        int length = 0;

        if (a.length < b.length) {
            length = a.length;

        } else {
            length = b.length;

        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (a[i] != b[i]) {
                count++;
            }

        }

        if (a.length != b.length) {
            System.out.println("Array lengths are not equal");
        } else if (count == 0) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");

        }

    }

    public static void checkIfArraysEqualSecondWay() {
        int a[] = {5, 1, 2, 8};
        int b[] = {5, 2, 1, 8};
        int c[] = {5, 2, 1, 8};
        System.out.println(Arrays.equals(a, b));//false, Before sorting

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));//true, after sorting

    }//boolean equals(int[] a, int[] a2), compare two arrays

    public static void split() {
        /*
         Split is used to split a String into array.
         Split() puts the elements in an array
         */

        //1
        String str = "Hi How Are You";// This is a String
        String strArray[] = str.split("Are");// Return [Hi How , You]// This is an array
        System.out.println(Arrays.toString(strArray));
        //2
        String str1 = "2112";
        String strArray1[] = str1.split("1");// it gives empty space between same chars
        System.out.println("Length of the string: " + strArray1.length);
        System.out.println(Arrays.toString(strArray1));// [, , , , 2, 2223, , , , , , 23, , , , , , 23]

        // How many chars are there except for space
        String str2 = "1131111 112111";
        String strArray2[] = str2.replace(" ", "").split("");
        System.out.println(Arrays.toString(strArray2));
        System.out.println(strArray2.length);

        // Count how many times "1" is used in this String?
        String str3 = "I laaaove Java";
        String strArray3[] = str3.split("a");
        System.out.println(Arrays.toString(strArray3));
        System.out.println(strArray3.length - 1);

        // split() method is used to split a String by using specific character/s
        // split() method puts the splitter parts in to an array.

        // "J" + "" ++ "" + + "v" + +" Good"

        String string = "J1111111111va Good";// [J, , , , , , , , , , va Good]
        String arr[] = string.split("1");
        System.out.println(Arrays.toString(arr));//

        String brr[] = string.split("");// separate the char
        System.out.println(Arrays.toString(brr));

        System.out.println(brr.length);

    }// String[] split(String regex)

    public static void equalsInArrays() {// '== ' and 'equals' in arrays

        int a[] = {1, 2, 3};
        int b[] = {1, 2, 3};
        int c[] = {2, 1, 3};

        System.out.println(a == b);// false, because they compare objects references which are different

        //boolean equals(Object obj)
        System.out.println(a.equals(b));// false, because they compare objects references which are different

        //boolean equals(int[] a, int[] a2), compare elements
        //Returns true if the two specified arrays of ints are equal to one another.
        System.out.println(Arrays.equals(a, b));// true,


    }

    public static void equalsStringArrayLIst() {// Q
        // Equals() method is used in array and list
        String a = "Hi";
        String b = "Hi";
        System.out.println(a.equals(b));

        String c = new String();
        String d = new String();
        c = "Hi";
        d = "Hi";
        System.out.println(c.equals(d));

        // equals in arraylist
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hi1");

        List<String> list1 = new ArrayList<>();
        list.add("Hi");
        list.add("Hi1");

        System.out.println(list.equals(list1));// Q: Why it does not give true?

    }
    public static void compare() {// Q



    }
    public static void mismatch() {// Q



    }

}
