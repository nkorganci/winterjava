package day11whileloopdowhlileloop;

public class DoWhileLoop03 {

    public static void main(String[] args) {
	int i = 1;// Do while is used for game codes.

	// If the condition is right it will work.
	while (i > 1) {
	    System.out.println("Hello while loop");
	}

	do { // it executes at lease one time.
	    System.out.println("Hello DO WHILE loop");
	} while (i > 1);

    }

    // Print odd integers by using do while loop

    public static void oddIntegers() {
	int i = 1;

	do {
	    if (i % 2 != 0) {
		System.out.println(i + " ");

	    }
	    i++;

	} while (i < 100);

    }

}
