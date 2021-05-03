package day00FunctionalProgramming.P01_FirstClassFunctions.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class L01_Maps {


    /*
    1-Working with Arrays and Lists Functionally
    2-Java Streams built in functions-> map, filter, reduce, collect
    3-Map only works with Streams
    4-Converting a LIst to a Stream -> myList.stream()
    5-Map and other stream functions do not mutate the original lists
        data used after calling map, filter.. is a modified copy of the original data.
    6-Each map or filter.. return another stream which might be converted to list( stream->list)
        myList.stream().map(timesTwo).collect(Collectors.toList());
     */

    public static void main(String[] args) {


    }
    public static void oddEven(){

        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList((intArray)));

        //1.Traditional Method
        List<Integer> doubled= new ArrayList<>();//doubled elements will be stored in here
        for(int i=0;i<listOfIntegers.size();i++){

            Integer result = listOfIntegers.get(i)*2;
            doubled.add(result);
        }

        //2.Functional Programming

        Function<Integer,Integer> multiply= x-> x*2;

        //Solution-a
        List<Integer> doubled1 =listOfIntegers.stream().map(t->t*2).collect(Collectors.toList());
        System.out.println(doubled1);

        //Solution-b
        List<Integer> doubled2=listOfIntegers.stream().map(multiply).collect(Collectors.toList());
    }

    public static void string1(){

    }


}

