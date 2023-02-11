package day01vairables.day36lambda;

import java.util.ArrayList;
import java.util.List;

public class L00_LambdaMethods {

    /*
    1-  IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper)
       1-a-> Returns an IntStream consisting of the results of replacing each element of this stream with
        the contents of a mapped stream produced by applying the provided mapping function to each element.
       1-b-> Returns: the new stream
       1-c-> FlatMap--> break the inner loops and return new stream
       1-d-> For Multidimensional arrays and list of list we use flatMap

    2- Comparator.comparing(t -> t.length()--> Comparator is a class and has methods like comparing to decide conditions
    3- list.parallelStream()--> can be used all except sorting.
    4- boolean , noneMatch, allMatch(Predicate<? super T> predicate); Returns whether all elements of this stream match the provided predicate.
    5- PREDICATE--> asks a question where the answer is true or false or, said another way, yes or no
    6- if you want to use "remove()" methods , do not use stream(), work with list directly.


     */


    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        System.out.println(numbers);



    }


}
