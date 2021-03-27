package day08stringmethodsmethodcreation;

public class StringMethods01 {

    public static void main(String[] args) {

	// TASK: By using String methods change the String ” Ali123 can?!@ ” to “Ali
	// CAN”

	String a = " Ali123 can?!@  ";

	// 1.WAY

	System.out.println(a.replaceAll("\\W", "").replace("123", " ").replace("can", "CAN"));

	// 2.WAY

	String firstName = a.substring(1, 4);
	String lastName = a.substring(8, 11).toUpperCase();
	System.out.println(firstName + " " + lastName); // Plus is for usually for operations
	System.out.println(firstName.concat(" ").concat(lastName)); // concat is better for String

	// 3.WAY

	System.out.println(a.trim().replaceAll("\\d", "").replace("can?!@", "CAN"));

	// TASK: String str2 = "$12.99";
	// String str2 = "$8.00";
	// Find the sum of them.

	String str1 = "$12.99";
	String str2 = "$8.00";

	String str3 = str1.replace("$", "").replace(".", "");
	String str4 = str2.replace("$", "").replace(".", "");

	System.out.println(str3);
	System.out.println(str4);

	// parseInt() method convert String to integer, if String has only digits.

	System.out.println((Integer.parseInt(str3) + Integer.parseInt(str4)) / 100.0);

	// valueOf does same like parseInt

	System.out.println((Integer.valueOf(str3) + Integer.valueOf(str4)) / 100.0);

	// How to convert String to a decimal

	String str5 = "$13.99";
	String str6 = "$9.00";

	String str7 = str5.replace("$", "");
	String str8 = str6.replace("$", "");

	System.out.println(str7);
	System.out.println(str8);

	System.out.println(Double.parseDouble(str7) + Double.parseDouble(str8));
	System.out.println(Double.valueOf(str7) + Double.valueOf(str8));

    }

}
