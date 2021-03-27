package methods_String;

public class ParseInt {

    public static void main(String[] args) {

	parseInt01();

    }

    public static void parseInt01() {// Integer.parseInt(String,radix)
	// It is basically used to convert binary to integer, octal to integer
	// Radix means root or base

	// Binary to decimal conversion
	System.out.println(Integer.parseInt("110", 2));
	System.out.println(Integer.parseInt("101010"));

	// String to decimal conversion
	System.out.println(Integer.parseInt("6B", 15));

    }

}
