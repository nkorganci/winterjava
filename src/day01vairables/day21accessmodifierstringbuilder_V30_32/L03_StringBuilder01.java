package day01vairables.day21accessmodifierstringbuilder_V30_32;

public class L03_StringBuilder01 {
    /*
     * StringBuilder: 1-Mutable, Can be updated without assigning, t String:
     * 1-Immutable, must be assigned in order to update.
     * 
     */

    public static void main(String[] args) {
	toString1();
	append('a');
    }

    public static void StringBuilder() {// 1st Way: Create and use append to add elements
	// If you add String often.
	// Constructs a string builder with no characters in it and an initial capacity
	// of 16 characters
	StringBuilder sb1 = new StringBuilder();// A string is created.
	System.out.println(sb1.capacity());// Default capacity is 16
	System.out.println(sb1);// An empty string, nothing will appear in console, ""

	// StringBuilder
	sb1.append("Ali Can"); // Automatically updated,not assigned no problem
	sb1.append(" is a student"); // Updated the previous one.
	System.out.println(sb1);// Ali can is a student

	// The differences between String and StringBuilder:
	String s1 = "Veli Han";
	System.out.println(s1);// Veli Han
	s1.toUpperCase();// is not assigned, will not be updated.
	System.out.println(s1.toUpperCase());// It return as upper case but not update s1
	System.out.println(s1);// Veli Han, because we did not assign in previous method.

    }

    public static void StringBuilder(String str) {// 2nd Way: , Ordinary string
	/*
	 * Constructs a string builder initialized to the contents of the specified
	 * string. The initial capacity is 16 plus the length of the string argument
	 */
	StringBuilder sb2 = new StringBuilder("Veli han is a parent");
	System.out.println(sb2);

    }

    public static void StringBuilder(int length) {// 3rd Way: , If you know length

	// creates an empty string Builder with the specified capacity as length.
	StringBuilder sb3 = new StringBuilder(5);// 5 is capacity as length.

	/*
	 * capacity of StringBuilder,length is number of elements which is used can be
	 * different.If you exceed the capacity java enlarge the capacity.,Default
	 * capacity is 16 characters.
	 */

	sb3.append("Java123456");

	System.out.println(sb3.capacity());// 12, Return current capacity of the StringBuilder field
	System.out.println(sb3.length());// 10, Return number of characters

	StringBuilder x = new StringBuilder("Java"); // Capacity is now 21.
	// If you write string in the StringBuilder , it adds to 16.

    }

    public static void append(String str) {// Can also be used in chain method
	StringBuilder sb1 = new StringBuilder();
	sb1.append("a").append("b").append("c");
	System.out.println(sb1);// support chain method

	// append can be used with char array too.
    }

    public static void append(CharSequence s, int start, int end) {// Appends a subsequence of the specified text
	// There are another append methods, i need to study.
	// If you want to add some characters use this method.
	StringBuilder sb1 = new StringBuilder();
	sb1.append("0123456");
	sb1.append(sb1, 0, 3);// add 0-2 characters.
	sb1.append("Hello", 1, 2);// You can add private string too.
	System.out.println(sb1);

    }

    public static void charAt(int index) { // Returns the char value in this sequence at the specified index.
	// Common method with String class.
	StringBuilder sb1 = new StringBuilder();
	sb1.append("Hello Java");
	System.out.println(sb1.charAt(0));// Return char at "0"
    }

    public static void delete(int start, int end) { // Removes the characters in a substring of this sequence.
	// Returns:This object.
	StringBuilder sb1 = new StringBuilder();
	sb1.append("Hello Java");

	sb1.delete(5, 8);// Delete multiple chars, String has no this method.
	System.out.println(sb1);

    }

    public static void deleteCharAt(int index) {
	StringBuilder str = new StringBuilder("Hi12");
	System.out.println(str.deleteCharAt(0));// return as removed index,Delete single character
	System.out.println(str);
    }

    public static void equalsCompare(String obj) {// equals(Object obj), return (this == obj);

	// String and StringBuilder are different data type, so they can not be equal
	StringBuilder a = new StringBuilder("Hello");
	String b = "Hello";
	System.out.println(a.equals(b));// Return false because they are different, b has green underline

	// sb1 and sb2 are two different object, equals( ==) check both value and
	// references.
	StringBuilder sb1 = new StringBuilder("Hello Java");
	StringBuilder sb2 = new StringBuilder("Hello Java");
	System.out.println(sb1.equals(sb2));// return false, both value and reference should be equal

    }

    public static void equalsCompareTo1() {//
	StringBuilder sb1 = new StringBuilder("Java");
	StringBuilder sb2 = new StringBuilder("Java");

	// StringBuilder returns false, because equals means == in here.
	System.out.println(sb1.equals(sb2));
	System.out.println(sb1 == sb2);

	// How can we compare the values of StringBuilders?

	// 1st Way: Convert StringBuilders to String then use equals() method

	System.out.println(sb1.toString().equals(sb2.toString()));

	// 2nd Way: use compareTo() method
	System.out.println(sb1.compareTo(sb2));// Return 0 ==> StringBuilders have same characters.

	// If chars are different
	StringBuilder sb3 = new StringBuilder("kava");
	StringBuilder sb4 = new StringBuilder("Java");
	// comparedTo() checks initial chars return differences
	System.out.println(sb3.compareTo(sb4));// Return 33 ==> StringBuilders have same characters.
    }

    public static void indexOf(String str) { // Returns the index within this string of the first occurrence of
					     // the specified substring.
	// It returns -1, if there is no that char.

	StringBuilder sb1 = new StringBuilder("Hello Java");
	System.out.println(sb1.indexOf("e"));
    }

    public static void indexOf(String str, int fromIndex) {// Returns the index within this string of the first
							   // occurrence of the specified substring, starting at the
							   // specified index.
	StringBuilder sb1 = new StringBuilder("Hello Java");
	System.out.println(sb1.indexOf("va", 1));

    }

    public static void insert(int offset, String str) {// There are too many insert override methods
	// can be used for product id

	// Insert "AA" in the index of 2
	StringBuilder sb1 = new StringBuilder("Hello Java");
	sb1.insert(2, "AA");
	System.out.println(sb1);

	// Insert substring in a given index
	sb1.insert(5, "AAAAAA", 2, 3);// in sb1, insert substring (2, 3) of "AAAA" to the index number of 5 in the sb1

    }

    public static void replace(int start, int end, String str) { // Replaces the characters in a substring of this
								 // sequence with characters in the specified String
	StringBuilder sb1 = new StringBuilder("Hello Java");
	sb1.replace(0, 1, "*");
	System.out.println(sb1);
    }

    public static void reverse() {

	// It updates automatically , no need to assign
	StringBuilder sb1 = new StringBuilder("Hello Java");
	sb1.reverse();
	System.out.println(sb1);
    }

    public static void setCharAt(int index, char ch) { // The character at the specified index is set to ch.

	StringBuilder sb1 = new StringBuilder("Hello Java");
	sb1.setCharAt(3, '8');
	System.out.println(sb1);
    }

    public static void subSequence(int start, int end) {// CharSequence subSequence(int start, int end),
							// return substring(start, end);

	StringBuilder sb1 = new StringBuilder("Hello Java");
	System.out.println(sb1.subSequence(2, 3));// Returns a new character sequence that is a subsequence of this
						  // sequence.
	System.out.println(sb1);// there was not update, so original one printed
    }

    public static void toString1() {// String toString()

	StringBuilder sb1 = new StringBuilder("Hello Javaaa");
	sb1.toString();// Converted to String, no more StringBuilder methods.
	System.out.println(sb1.toString());// This is String , no more StringBuilder methods
	System.out.println(sb1);
    }

    public static void trimToSize1() { // trimToSize()
	StringBuilder sb1 = new StringBuilder("Hello Java");
	sb1.trimToSize();// Attempts to reduce storage used for the character sequence.
	System.out.println(sb1);
    }

    public static void append(char ch) {// StringBuilder append(char[] str)

	StringBuilder stb = new StringBuilder("Learn ");
	char[] ch1 = new char[] { 'J', 'A', 'V', 'A' };
	stb.append(ch1);

	System.out.println(stb);

    }
}
