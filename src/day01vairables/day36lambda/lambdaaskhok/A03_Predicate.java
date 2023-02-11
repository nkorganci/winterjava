package day01vairables.day36lambda.lambdaaskhok;

import java.util.function.Predicate;

public class A03_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> p = i->i>10;
        System.out.println(p.test(3));

        // Declare array and print in order with lambda expression

        String [] arr = {"C","D","A"};

        Predicate<String> p1 = name -> name.charAt(0)=='A';

        for(String n:arr){
            if(p1.test(n)){
                System.out.println(n);
            }
        }



    }
}
