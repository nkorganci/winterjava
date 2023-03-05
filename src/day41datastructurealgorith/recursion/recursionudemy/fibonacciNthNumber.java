package day41datastructurealgorith.recursion.recursionudemy;

public class fibonacciNthNumber {
    public static void main(String[] args) {

        System.out.println(fibonacciN(9));

    }

    public static int fibonacciN(int n) {

        // 0 1 1 2 3 5 8 13 21 34...
        // f(n) =f(n-1) + f(n-2)
        // nth fibonacci = (n-1) + (n-2)

        if (n <= 2) {
            return 1;
        }

        int sum = fibonacciN(n - 1) + fibonacciN(n - 2);

        return sum;


    }
}
