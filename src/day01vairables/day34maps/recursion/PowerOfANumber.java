package day01vairables.day34maps.recursion;

public class PowerOfANumber {
    public static void main(String[] args) {

        System.out.println(powerNum(2,4));
    }
    public static int powerNum(int a,int b){

        if(b<1)
            return 1;
        return a*powerNum(a,b-1);
    }
}
