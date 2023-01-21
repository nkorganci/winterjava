package day41designpatterns.singleton.recursion;

public class FindSumOfNumbers {
    public static void main(String[] args) {

    }

    public static int sumNum(int a){

        return a ? a%10+sumNum(a/10):0;
    }
}
