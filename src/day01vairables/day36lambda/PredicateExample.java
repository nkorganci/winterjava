package day01vairables.day36lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        //Creating Predicate
        Predicate<Integer> less = i->(i<13);

        // Calling Predicate method
        System.out.println(less.test(33));

    }
}
