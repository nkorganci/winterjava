package day01vairables.day36lambda.lambdaaskhok;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L10_MapFunction {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Hi","Bye");
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        //square of numbers
        List<Integer> square = numbers.stream().map((t->t*t)).collect(Collectors.toList());
        System.out.println("Squares: "+ square);

    }
}
