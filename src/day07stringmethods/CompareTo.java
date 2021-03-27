package day07stringmethods;

public class CompareTo {

    public static void main(String[] args) {

	// https://www.youtube.com/watch?v=iTC43mLZG38
	// It checks value of characters when they are not equal inletters to each
	// other.

	String str1 = "adfy";

	String str2 = "";
	// This is an empty string

	String str3 = "adfe";

	System.out.println(str1.compareTo(str2));

	System.out.println(str2.compareTo(str3));

	System.out.println(str1.compareTo(str3));

	String s1 = "BEGINNERSBOOK"; // uppercase
	String s2 = "beginnersBOOK"; // mixedcase
	s1.compareTo(s2); // this would return non-zero value
	s1.compareToIgnoreCase(s2); // this would return zero

    }

}
