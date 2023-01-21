package day41designpatterns.singleton.recursion;

public class SumOfTheNumFromMaxtoMin {
    public static void main(String[] args) {
        System.out.println(sumOfNum(6));

    }

    public static int sumOfNum(int a){

        if(a<0)
            return 0;
        return a+sumOfNum(a-1);
    }
}
