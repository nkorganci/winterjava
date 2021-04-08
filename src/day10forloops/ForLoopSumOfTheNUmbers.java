package day10forloops;

public class ForLoopSumOfTheNUmbers {

    public static void main(String[] args) {
	numbersAdd();

    }

    // find the sum of the all integers from 10 to 100.
    public static void numbersAdd() {


	int sum = 0;
	for (int i = 100; i >= 10; i--) {
	    sum = sum + i;

	}
	System.out.println(sum);

    }

}
