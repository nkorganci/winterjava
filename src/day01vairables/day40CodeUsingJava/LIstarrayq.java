package day01vairables.day40CodeUsingJava;

import java.util.ArrayList;
import java.util.List;
/*
Explanation -
Lambda expression's parameter a cannot redeclare another local variable defined in an enclosing scope.
 */

public class LIstarrayq {
}


class Test33 {
    public static void main(String[] args) {
        Integer a = 11;
        List<Integer> testList = new ArrayList<>();
        testList.add(a);
        testList.add(a *= 5);
        testList.add(a);// a is updated to 55

        testList.removeIf(t -> t == 11);//UPDATED, i changed a to t
        //testList.removeIf(a -> a == 1);//ORIGIN
        // Lambda expression's parameter a cannot redeclare another local variable defined in an enclosing scope.

        System.out.println(testList);
    }
}