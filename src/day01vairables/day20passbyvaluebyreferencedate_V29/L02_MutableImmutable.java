package day01vairables.day20passbyvaluebyreferencedate_V29;

public class L02_MutableImmutable {

    public static void main(String[] args) {

	String a = "Java";
	String b = "Java";
	String c = new String("Java");// Creates new container

	// == method check both value and reference
	System.out.println(a + " " + b + " " + " " + c);
	System.out.println(a == b);// It checks both value and reference, true
	System.out.println(a == c);// vaues are same but reference are different

	// equals() method checks only values
	System.out.println(a.equals(b));// True, checks only value
	System.out.println(a.equals(c));// True
	System.out.println(b.equals(c));// True

	// Scanner method also created new container

	// primitive data types behave like immutable
	int aa = 2;
	int bb = 2;
	System.out.println(aa == bb);

    }

}
