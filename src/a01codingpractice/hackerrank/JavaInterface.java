package a01codingpractice.hackerrank;

public class JavaInterface {
    public static void main(String[] args) {

        System.out.println(MyCalculator(3));

    }

    public static int MyCalculator(int num){

        int sum =0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0)    {
                sum=sum+i;
            }
        }

        return sum;


    }
}
