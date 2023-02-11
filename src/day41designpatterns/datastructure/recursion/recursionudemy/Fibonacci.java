package day41designpatterns.datastructure.recursion.recursionudemy;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibo(9));
        System.out.println(a(1234));


    }

    public static int fibo(int n ){

        if(n<=1)
            return n;
        return fibo(n-1) + fibo(n-2);
    }

    public static int a(int n ){      // 1234

        if(n<10)
            return n;

        return n%10 + a(n/10);
    }

    public static int b(int n, int p ){

        if(p<=0)
        return 1;
        return  n*b(n,p-1);
    }
    public static int c(int n ){

        return 0;
    }
    public static int d(int n ){

        return 0;
    }
    public static int e(int n ){

        return 0;
    }


}
