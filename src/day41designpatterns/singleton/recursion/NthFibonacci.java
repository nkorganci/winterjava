package day41designpatterns.singleton.recursion;

public class NthFibonacci {
    public static void main(String[] args) {



        int index =0;
        while (true){
            System.out.println(fib(index));
            index++;
        }

    }

    public static int fib(int m) {

        if(m==0) return 0;
        if(m<=2) return 1;
        return fib(m - 1) + fib(m - 2);
    }
}
