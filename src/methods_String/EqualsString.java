package methods_String;

import java.util.Scanner;

public class EqualsString {

    public static void main(String[] args) {
	// If you get a data from user, it will create a new string, not from String
	// pool
	String a = "Java";
	String b = "Java";

	String c = new String("Java");
	String f = "jav" + "a";// Origin is "Jav"

	Scanner scan = new Scanner(System.in);
	System.out.println("Write java: ");
	String g = scan.next();// Creates new container.

	System.out.println(a == b);// true, because java use String pool for same values(it also has same
				   // refereceF)
	System.out.println(a == c);// false, c is created as new container, difference box and reference
	System.out.println(a == f);// same values but different references
	System.out.println(a.equals(f));

    }

}
