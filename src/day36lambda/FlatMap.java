package day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        l.add("Hi");
        l.add("Hi1");
        l.add("Hi2");

        // Map
       List<Integer> list =  l.stream().map(t->t.length()).collect(Collectors.toList());
        System.out.println(list);

        //FlatMap
        List<List<Integer>> number = new ArrayList<>();
        number.add(Arrays.asList(2,4));
        number.add(Arrays.asList(2,4));
        List<Integer> flatList= number.stream().flatMap(t->t.stream()).collect(Collectors.toList());
        System.out.println(number);
        System.out.println(flatList);;
    }

    public static void runFlatMap(String str){


    }
}
