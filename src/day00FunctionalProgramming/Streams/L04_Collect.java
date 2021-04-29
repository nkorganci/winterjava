package day00FunctionalProgramming.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class L04_Collect {

    /*
    1-collect(...) can return any data typa
     */

    public static void main(String[] args) {


        String[] wordsArr = { "hello", "functional", "programming", "is", "cool" };
        //Find the Strings which has length more than 5;
        List<String> list = new ArrayList<>(Arrays.asList(wordsArr));


        List<String> l =  list.stream().filter(t->t.length()>5).collect(Collectors.toList());
        System.out.println(l);

        Set<String> l1 =  list.stream().filter(t->t.length()>5).collect(Collectors.toSet());
        System.out.println(l1);

        //Joining->Returns a Collector that concatenates the input elements, separated by the specified delimiter, in encounter order.
       String l2 =  list.stream().filter(t->t.length()>5).collect(Collectors.joining("/"));
        System.out.println(l2);

        //Counting-> does not take any parameter
       Long l3 =  list.stream().filter(t->t.length()>5).collect(Collectors.counting());
       Long l4 =  list.stream().filter(t->t.length()>5).count();//Shorter version
        System.out.println(l3);

        //GroupingBy()-> return map, Map<K, List<T>>
        Map<Integer,List<String>> l5 =  list.stream().filter(t->t.length()>2).collect(Collectors.groupingBy(t->t.length()));
        Map<Integer,List<String>> l6 =  list.stream().filter(t->t.length()>2).collect(Collectors.groupingBy(String::length));//String has already
        System.out.println(l5);


        //PartitioningBy()-> return Map<Boolean, List<T>>>
        Map<Boolean, List<String>> l7 =  list.stream().filter(t->t.length()>2).collect(Collectors.partitioningBy(t->t.length()>4));
        System.out.println(l7);




    }
}
