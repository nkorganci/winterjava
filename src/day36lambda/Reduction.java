package day36lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduction {
    public static void main(String[] args) {

        //Addition of Numbers in a list
        List<Integer> numbers = Arrays.asList(1,3,4);
        int result = numbers.stream().reduce(0,(x,y)->x+y);
        System.out.println(result);

        //Modifications on string
        List<String> str = Arrays.asList("hi","bye","yes");
       String result1= str.stream().reduce(" ",(x,y)->x.toUpperCase()+y.toUpperCase());
        System.out.println(result1);

    }
}
