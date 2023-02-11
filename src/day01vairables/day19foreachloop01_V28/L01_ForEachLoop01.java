package day01vairables.day19foreachloop01_V28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L01_ForEachLoop01 {

    public static void commonElements() {// Can I solve with contain metod??Try it please
	List<Integer> list1 = new ArrayList<>();
	list1.add(11);
	list1.add(12);
	list1.add(13);
	list1.add(14);
	list1.add(15);
	System.out.println(list1);

	List<Integer> list2 = new ArrayList<>();
	list2.add(7);
	list2.add(14);
	list2.add(11);
	list2.add(14);
	list2.add(15);
	list2.add(17);
	System.out.println(list2);

	List<Integer> commonEl = new ArrayList<>();
	for (int w : list1) {
	    for (int t : list2) {
		if (w == t) {
		    if (!commonEl.contains(w)) {// Delete repeated more than one common ones.
			commonEl.add(w);
		    }
		}
	    }
	}
	System.out.println(commonEl);

    }

    public static void countVowels() {

	/*
	 * Ask user to enter a String and count the vowels(a,e,i,o,u) contained in the
	 * String AliCan ==> The number of a = 2 The number of i = 1
	 */
	int aCounter = 0;
	int eCounter = 0;
	int iCounter = 0;
	int oCounter = 0;
	int uCounter = 0;

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a String to see how many vowels did you use: ");
	String str = scan.nextLine().toLowerCase();

	String ch[] = str.split("");// Split doent return char, return String
	System.out.println(Arrays.toString(ch));

	for (String w : ch) {
	    switch (w) {
	    case "a":
		aCounter++;
		break;
	    case "e":
		eCounter++;
		break;
	    case "i":
		iCounter++;
		break;
	    case "o":
		oCounter++;
		break;
	    case "u":
		uCounter++;
		break;
	    }

	}

	System.out.println("aCounter= " + aCounter);
	System.out.println("eCounter= " + eCounter);
	System.out.println("iCounter= " + iCounter);
	System.out.println("oCounter= " + oCounter);
	System.out.println("uCounter= " + uCounter);

    }

    public static void evenElementsList() {
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(33);
	list.add(9);

	// 1st Way

	for (int i = 0; i < list.size(); i++) {
	    if (list.get(i) % 2 == 0) {
		list.remove(list.indexOf(list.get(i)));
		i--;

	    }
	}
	System.out.println(list);
	// 2nd Way
    }

    public static void evenElementsPrint() {// // Print even elements inside list, Boxing&Unboxing

	List<Integer> list1 = new ArrayList<>();
	list1.add(11);
	list1.add(13);
	list1.add(15);
	list1.add(12);
	list1.add(14);
	// 1st Way
	for (Integer w : list1) {
	    if (w % 2 == 0) {
		System.out.print(w + " ");

	    }
	}

	System.out.println();

	// 2nd Way

	for (int w : list1) {
	    if (w % 2 != 0) {
		continue;// Skips the element
	    }
	    System.out.print(w + " ");
	}

	System.out.println();// For empty space

	int a = 12;
	Integer b = 12;
	// int --> Autoboxing --> Integer (autowidening is used for primitive data
	// types)

	int c = b;// b non primitive is assigned to primitive one, no complaining, because it is
		  // Wrapper class
	// Integer --> Unboxing --> int

	System.out.println(a + "-" + b + " -" + c);

    }

    public static void firstThreeElement() {

	List<Integer> list1 = new ArrayList<>();
	list1.add(11);
	list1.add(13);
	list1.add(15);
	list1.add(12);
	list1.add(14);

	// Use for-each loop to print first 3 elements in the list
	// 1.Way
	for (int w : list1) {
	    if (list1.indexOf(w) < 3) {
		System.out.print(w + " ");
	    }
	}

	// 2nd way
	for (int w : list1.subList(0, 3)) {
	    System.out.println(w + " ");

	}

	// 3rd way
	for (int w : list1) {
	    if (list1.indexOf(w) > 2) {
		break; // takes you outside of the loop
	    }
	    System.out.println(w + " ");

	}

    }

    public static void forLoop() {// Print the elements of List-1st Method
	// QUESTION: I DID NOT UNDERSTAND HOW FOR EACH LOOPS WORK
	// Is used with collections.
	// Array is a collections(technically not)

	List<Integer> list1 = new ArrayList<>();
	list1.add(11);
	list1.add(13);
	list1.add(15);
	list1.add(12);
	list1.add(14);
	for (int i = 0; i < list1.size(); i++) {
	    System.out.print(list1.get(i) + " ");
	}

	// 2nd Way

	// Enhanced for each loop

	List<Integer> list2 = new ArrayList<>();
	list2.add(11);
	list2.add(13);
	list2.add(15);
	list2.add(12);
	list2.add(14);
	for (Integer w : list2) {
	    System.out.print(w + " ");

	}

    }

    public static void getInitials() {// QUESTION: just name was supposed to give error?

	/*
	 * Ask user to enter 5 full names(No middle name) Get the initials of the first
	 * and the last name, concatenate them and store in a list Print the list on the
	 * console Example; if user enters �Ali Can�, �Veli Han�, �Kemal Mert� ==> [AC,
	 * VH, KM]
	 */
	List<String> names = new ArrayList<>(); // This is empty
	Scanner scan = new Scanner(System.in);
	int i = 0;

	do {
	    System.out.println("Write your first and last name: ");
	    names.add(scan.nextLine().trim().replaceAll("\\s+", " "));
	    i++;

	} while (i < 5);

	List<String> initials = new ArrayList<>();

	for (String w : names) {
	    initials.add(w.substring(0, 1) + w.charAt(w.indexOf(" ") + 1));
	}
	System.out.println(initials);

    }

    public static void lastThreeElements() {// Print last 3 elements, //SOLVE AGAIN

	// print last 3 elements

	List<Integer> list1 = new ArrayList<>();
	list1.add(11);
	list1.add(13);
	list1.add(15);
	list1.add(12);
	list1.add(14);

	// 1st Way

	for (int w : list1) {
	    if (list1.indexOf(w) >= list1.size() - 3) {
		System.out.print(w + " ");

		// System.out.print(w + ' ');//If you write char ' ' it accept as number.

	    }
	}

	System.out.println();

	// 2nd Way, this is a good way
	// When there is a continue method, next code will not be executed.
	// Continue will continue till loop finish

	for (int w : list1) {
	    if (list1.indexOf(w) < list1.size() - 3) {
		continue;
	    }
	    System.out.print(w + " ");
	}

	System.out.println();

	// 3rd Way

	for (int w : list1.subList(list1.size() - 3, list1.size())) {
	    System.out.print(w + " ");
	}

    }

    public static void main(String[] args) {

	// practiceNNN();

    }

    public static void removeRepeatedElements() {

	List<String> list = new ArrayList<>();
	List<String> distincList = new ArrayList<>();

	list.add("a");
	list.add("b");
	list.add("c");
	list.add("a");

	// 1stWay

	for (String w : list) {

	    if (!distincList.contains(w)) {
		distincList.add(w);
	    }

	}
	System.out.println(distincList);

	// 2.Way
	for (String w : list) {
	    if (distincList.contains(w)) {
		continue;
	    }
	    distincList.add(w);
	}

	System.out.println(distincList);

    }

    public static void pp() {

    }
}
