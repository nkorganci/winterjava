package day07stringmethods;

public class CharAt {

    public static void main(String[] args) {

	// 1.charAt()

	String str = "1234567891";

	char ch1 = str.charAt(0);
	System.out.println(ch1);
	// Return 1st character of str

	char ch6 = str.charAt(6);
	System.out.println(ch6);
	// Return 7th character of str

	// char ch10 = str.charAt(10);
	// System.out.println(ch10);
	// If index which is greater than length()-1, return IndexOutOfBoundsException

	// char chN = str.charAt(-1);
	// System.out.println(chN);
	// negative index return IndexOutOfBoundsException

	// for (int i = 0; i < str.length(); i++) {
	// System.out.print(str.charAt(i));
	// print all characters of string

	
	//How many same character are there in the sam text
	int count = 0;
	for (int j = 0; j < str.length(); j++) {
	    if (str.charAt(j) == '1') {
		count++;

	    }

	}
	System.out.println("1 is counted " + count + " times");

    }

}
