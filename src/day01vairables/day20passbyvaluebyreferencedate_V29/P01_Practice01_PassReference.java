package day01vairables.day20passbyvaluebyreferencedate_V29;

public class P01_Practice01_PassReference {

    public static void main(String[] args) {

	int x = 5; // int behave like static value, it pass copy of x to change(x) method
	// Pass by value is applied to here
	change(x);
	System.out.println(x);

    }

    public static void change(int x) {
	x = 20;
    }

}
