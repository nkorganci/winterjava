package day01vairables.day22stringbuilderencapsulation_31;

public class L01_StringBuilder01 {

    public static void main(String[] args) {

    }

    public static void equalsOfStringStringBuilder() {// How do compare two StringBuilder
	StringBuilder sb1 = new StringBuilder("Java");
	StringBuilder sb2 = new StringBuilder("Java");

	// StringBuilder returns false, because equals means == in here.
	System.out.println(sb1.equals(sb2));
	System.out.println(sb1 == sb2);

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

    public static void speedOfAppendConcat() {// which one is faster, concat or append
	// StringBuilder append() is faster
	StringBuilder sb1 = new StringBuilder();// Java create a container.
	long startTimesb = System.nanoTime();

	for (int i = 0; i < 1000; i++) { // there is no garbage collector because no new containers created
	    sb1.append("abc");
	}
	long endingTimeSb = System.nanoTime();

	System.out.println(endingTimeSb - startTimesb);

	// String concat slower.

	long startTimeStr = System.nanoTime();
	String str1 = new String();
	for (int i = 0; i < 1000; i++) {// Java created 1000 new container
	    str1.concat("abc");
	}
	long endingTimeStr = System.nanoTime();

	System.out.println(endingTimeStr - startTimeStr);
	System.out.println(endingTimeStr - endingTimeSb);// String is a lot slower
    }
}
