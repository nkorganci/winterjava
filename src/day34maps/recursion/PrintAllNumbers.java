package day34maps.recursion;

public class PrintAllNumbers {
    public static void main(String[] args) {

        printNum(8);
    }

    public static void printNum(int n) {

        if (n <= 0) {
            System.out.println("Finished");
        } else {
            printNum(n - 1);
            System.out.println(n);
        }


    }
}
