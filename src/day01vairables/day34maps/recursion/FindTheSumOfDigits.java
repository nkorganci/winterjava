package day01vairables.day34maps.recursion;

public class FindTheSumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumOfPositiveInt(112));

    }
    public static int sumOfPositiveInt(int n){

        if(n==0)
            return 0;
        return n%10+ sumOfPositiveInt(n/10);
    }
}
