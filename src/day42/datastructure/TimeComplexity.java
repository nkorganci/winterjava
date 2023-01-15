package day42.datastructure;

import java.sql.Time;

public class TimeComplexity {

    public static void main(String[] args) {
        double now1 = System.currentTimeMillis();
        findSum2(99999);
        double now2 = System.currentTimeMillis();
        System.out.println(now2-now1);// o for 1, 2.0 for 2nd way

    }

    public static int findSum1(int n){
        return n*(n+1)/2;
    }

    public static int findSum2(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=i;
        }
        return sum;
    }
}
