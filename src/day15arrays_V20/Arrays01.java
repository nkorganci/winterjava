package day15arrays_V20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays01 {
    // int num[] = { 5,1, 2, 8 };
// Arrays.toStringReturns a string representation of the contents of the specified array.
// The main() method must be called from a static method only inside the same class.
    // Equals is a method of Object class
    // For objects we dont use "==" operator, array is an object
    // If you want to use array method, you should start with Arrays.....

    public static void main(String[] args) {
	array01();
	array02();
	array03();
	array04();

// System.out.println(Arrays.toString(args));// print nothing, because there is
//nothing in it.

//args[0] = "Ali";
//System.out.println(Arrays.toString(args));// will give error because String
//array is empty.

    }

    public static void arrayGeneralInformation() {
	int num[] = { 5, 1, 2, 8 };
	System.out.println(Arrays.toString(num));

	// SORTING ARRAY
	Arrays.sort(num); // How can I assign it to a new object.
	System.out.println(Arrays.toString(num));

	// Sorting in descending order

	int reNum[] = new int[num.length];

	for (int i = 0; i < reNum.length; i++) {
	    reNum[i] = num[num.length - 1 - i];

	}
	System.out.println(Arrays.toString(reNum));

	// How to check if an element exist or not

	int num2[] = { 1, 4, 2, 3 };
	Arrays.sort(num2);
	System.out.println(Arrays.binarySearch(num2, 4));

    }

    public static void array01() {// METHOD 1 toString: Representation

	int num[] = { 5, 1, 2, 8 };
	System.out.println(Arrays.toString(num));
	System.out.println(num);// Gives only reference value
	System.out.println(num.toString());// Gives only reference value

    }

    public static void array02() {// METHOD 2 sort : an array ascending order
	int num[] = { 5, 1, 2, 8 };
	Arrays.sort(num);
	System.out.println(Arrays.toString(num));
    }

    public static void array03() {// sort an array in descending order
	int num[] = { 5, 1, 2, 8 };
	Arrays.sort(num);

	int revNum[] = new int[num.length];// Default values are [0,0,0,...]

	for (int i = 0; i < num.length; i++) {

	    revNum[i] = num[num.length - 1 - i];
	    // num[i]=num[num.length - 1 - i];//This does not work,orginal array change
	}

	System.out.println(Arrays.toString(revNum));

    }

    public static void array04() {// METHOD 3 binarySearch():
	// How to check if an element exist or not
	// Sort array (must be sorted)
	// Use binarySearch() method
	// Binary search is used to search a key element from multiple elements. Binary
	// search is faster than linear search.
	// In case of binary search, array elements must be in ascending order.
	// a the array to be searched, key the value to be searched for

	int num[] = { 5, 1, 2, 8 };
	Arrays.sort(num);

	System.out.println(Arrays.binarySearch(num, 1));// Return index of that element
	System.out.println(Arrays.binarySearch(num, 4));// If there is no 4, Return -3 (3rd element, not index)
	System.out.println(Arrays.binarySearch(num, 7));//

    }

    public static void name2() {// '== ' and 'equals'in String and primitive data type

	// "==" checks both values and references
	int a = 2;
	int b = 2;
	System.out.println(a == b);// true, "==" for primitive, this is an operator,compare, references

	// Comparison of two string, not object
	String c = "2";
	String d = "2";
	System.out.println(c == d);// true, "==" for String
	System.out.println(c.equals(d));// true, "equals" for string,equals() is a method

	// Comparison of an object and string copy
	String e = new String();
	e = "2";
	String f = new String();
	f = "2";
	System.out.println(e == f);// "==" for String
	System.out.println(e.equals(f));// "equals" for string

	// compare two objects
	String g = new String("2");// Object 1,same values but different references
	String h = new String("2");// Object 2
	System.out.println(g == h);// return false, 2 object, 2 references
	System.out.println(g.equals(h));// return true, same values

	Thread t1 = new Thread();
	Thread t2 = new Thread();
	Thread t3 = t1;

	String s1 = new String("GEEKS");
	String s2 = new String("GEEKS");

	String s3 = "GEEKS";

	System.out.println(s3 == s1);
	System.out.println(s3.equals(s1));

	System.out.println(t1 == t3);
	System.out.println(t1 == t2);
	System.out.println(s1 == s2);

	System.out.println(t1.equals(t2));
	System.out.println(s1.equals(s2));
    }

    public static void arrayString() {

	int a[] = new int[3];
	a[0] = 2;
	a[1] = 2;
	a[2] = 2;

	System.out.println(Arrays.toString(a));// a is array is an object, need a method to print
	System.out.println(a[0]);// a[] is a string, can be printed directly

    }

    public static void charArray() {// Char default value is empty [ , ,]
    }

    public static void checkSpecificElement() {// binarySearch(int[] a, int key), return index of that key
	// Dont use Arrays.binarySearch() if there is repeated elements

	int b[] = { 1, 9, 3, 9, 9 };
	Arrays.sort(b); // Must be sorted first of all

	Arrays.binarySearch(b, 2);
	System.out.println(Arrays.binarySearch(b, 1));// Index of element "1" in array b
	System.out.println(Arrays.binarySearch(b, 9));// If there are more than one same element, returns index of first
	System.out.println(Arrays.binarySearch(b, 5)); // return -3, 5 supposed to be in 5th element not index

    }

    public static void equalArrays() {// equals(int[] a, int[] a2), if a==a2
	int a[] = { 1, 2, 5, 2, 0, 5, 3 };
	int b[] = { 1, 2, 5, 2, 0, 9, 3 };
	int c[] = { 1, 2, 5, 2, 0, 9, 3 };

	System.out.println(Arrays.equals(b, c));// true

    }

    public static void split() {// String[] split(String regex)
	// Split is used to split a String
	// Split() puts the elements in an array

	String str = "Hi How Are You";
	String strArray[] = str.split("Are");// Return [Hi How , You]
	System.out.println(Arrays.toString(strArray));

	String str1 = "1111212231111111";
	String strArray1[] = str1.split("1");// it gives empty space between same chars
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

    }

    public static void name() {// Check if array a equals to b
	int a[] = { 5, 2, 6, 3 };
	int b[] = { 5, 2, 6 };
	int c[] = { 5, 6, 2 };

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

    public static void name1() {// 2nd Way: METHDO equals():
	// Equals is a method of Object class
	// For objects we dont use "==" operator, array is an object
	// 2ND WAY: Sort arrays, after sorting if they are equal to each other

	int d[] = { 2, 9, 3 };
	int e[] = { 2, 3, 9 };

	System.out.println(Arrays.equals(d, e));// Return false

    }

    public static void name3() {// '== ' and 'equals' in arrays

	int a[] = { 1, 2, 3 };
	int b[] = { 1, 2, 3 };
	int c[] = { 2, 1, 3 };

	System.out.println(a == b);// false, because they compare objects references which are different
	System.out.println(a.equals(b));// false, because they compare objects references which are different
	System.out.println(Arrays.equals(a, b));// true,

    }

    public static void equalsStringArray() {// Q
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

}
