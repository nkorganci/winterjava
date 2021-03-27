package day10forloops;

public class ForLoop03 {

    public static void main(String[] args) {
	numbersAdd();

    }

    // find the sum of the all integers from 10 to 100.
    public static void numbersAdd() {

//	Scanner a = new Scanner(System.in);
//	System.out.println("sdfs");

	int sum = 0;
	for (int i = 100; i >= 10; i--) {
	    sum = sum + i;

	}
	System.out.println(sum);

    }

}
