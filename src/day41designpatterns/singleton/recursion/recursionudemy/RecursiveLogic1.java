package day41designpatterns.singleton.recursion.recursionudemy;

public class RecursiveLogic1 {
    public static void main(String[] args) {

        count(4);
    }
    public static void count(int n){
        if(n<1)
            return;
        count(n-1);
        System.out.println(n);
    }
}
