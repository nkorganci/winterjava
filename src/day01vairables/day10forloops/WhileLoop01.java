package day01vairables.day10forloops;

public class WhileLoop01 {

    public static void main(String[] args) {

        oddInt();
        System.out.println();
        printOdd2();
        System.out.println();
        print3();

    }

    public static void oddInt() {
        // print odd integerf from 4 to 25 in same line with spaces. wia while and for
        // loop
        for (int i = 5; i < 26; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printOdd2() {

        int i = 4;
        while (i < 26) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

    }

    public static void print3() {
        // Create a method to print integers which are divisible by 6 and 8 from 500 to
        // 25 on the console

        int a = 500;
        while (a > 24) {
            if (a % 6 == 0 && a % 8 == 0 && a > 24) {
                System.out.print(a + " ");
            }
            a--;

        }
    }
}
