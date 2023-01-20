package day41designpatterns.singleton.recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {

        int n = 6;
        fibonacci(8);

    }

    private static void fibonacci(int n) {

      int n1=0;
      int n2=1;
      int sum=0;

        System.out.println(n1 + " " + n2);

        for (int i = 2; i <10 ; i++) {

            sum=n1+n2;
            System.out.println(i +" num is " + sum); // 7 num is 13

            n1=n2;
            n2=sum;
        }
    }
}
