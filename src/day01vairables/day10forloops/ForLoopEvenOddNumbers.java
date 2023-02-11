package day01vairables.day10forloops;

public class ForLoopEvenOddNumbers {

    public static void main(String[] args) {
        // printEvenInt();
        printEvenInt2();

    }

    /*
     * Print all even integers from 100 to 23 in the same line with a space among
     * them.
     */

    public static void printEvenInt() {

        for (int i = 100; i > 22; i--) { // i=i-2; can be written.
            System.out.print(i + " ");

        }

    }

    public static void printEvenInt2() {

        for (int i = 100; i > 22; i = i - 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

}
