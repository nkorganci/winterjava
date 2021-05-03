package day00FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class L03_Reduce {
    /*
    1- Reduce take all data and return single data
    2- .reduce(sum)-> (acc, x)-> acc+x
        a-first argument: acc=Current or initial value, called "carry" or "accumulator"
        b-second argument: x=current element of the stream, initial element of the list
        c-It is better to write your carrier value,initial value
        d-reduce() does not return stream(), no need to call .collect
        e-BinaryOperator is used with Reduce()
        f-Must return an Integer/same type of stream of elements.


        reduce(startingValue, func)

        .reduce(func)               ->Optional<T>
        .reduce(startingValue,func) ->T


    */

    public static void main(String[] args) {
        reduce();

    }

    public static void reduce() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        //FirstWay
        BinaryOperator<Integer> getSum = (acc, x) -> {
            Integer result = acc + x;
            System.out.println("acc: " + acc + ", X: " + x + ", result:" + result);
            return result;

        };

        Integer sum = listOfIntegers.stream().reduce(0, getSum);
        System.out.println(sum);

        //SecondWay

        Optional<Integer> sum1 =listOfIntegers.stream().reduce((x, y)-> x+y);
        System.out.println(sum1);



    }
}
