package day34maps.recursion;

public class FindSumOfNumbers {
    public static void main(String[] args) {

        System.out.println(sumNum(123));

    }

    public static int sumNum(int a){

        if(a==0 || a<0)
            return 0;
        return  a%10+sumNum(a/10);
    }
}
