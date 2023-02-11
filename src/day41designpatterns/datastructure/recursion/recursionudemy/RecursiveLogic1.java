package day41designpatterns.datastructure.recursion.recursionudemy;

public class RecursiveLogic1 {
    public static void main(String[] args) {

        count(4);
        System.out.println(calFactorial(5));
    }
    public static void count(int n){
        if(n<1)
            return;
        count(n-1);
        System.out.println(n);
    }

    public static int calFactorial(int n){
        if(n<1)
            return 1;
        return n*calFactorial(n-1);
    }
}
