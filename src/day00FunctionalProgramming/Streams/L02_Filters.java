package day00FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class L02_Filters {

    /*
    1-Filter()->return true or false for each element, if is is true, it will be kept in outstream
    2-A predicate is a function of a set of parameters that returns a boolean as an answer
        Predicate<T>, it is used with Filter()
     */
    public static void main(String[] args) {

    variableLength();
    }

    public static void oddEven(){
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list= new ArrayList<>(Arrays.asList(intArray));

        //1stWay
        List<Integer> odd = list.stream().filter(t->t%2!=0).collect(Collectors.toList());
        System.out.println(odd);

        //2ndWay
        Predicate<Integer> isEven = x->x%2!=0;
        List<Integer> odd1 = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(odd1);
    }

    public static void fixedLengthOfString(){

        String[] wordsArr = { "hello", "functional", "programming", "is", "cool" };
        //Find the Strings which has length more than 5;


        List<String> list = new ArrayList<>(Arrays.asList(wordsArr));

        //1stWay
        List<String> l =  list.stream().filter(t->t.length()>5).collect(Collectors.toList());

        //2ndWay
        Predicate<String> size = t->t.length()>5;
        List<String> l1 =  list.stream().filter(size).collect(Collectors.toList());

        System.out.println(l);

    }
    public static void variableLength(){

        String[] wordsArr = { "hello", "functional", "programming", "is", "cool" };
        List<String > words= new ArrayList<>(Arrays.asList(wordsArr));

        //User defined length

        Function<Integer,Predicate<String>> createLengthTest=(minLength)->{
            return (str)->str.length()>minLength;
        };

        Predicate<String> isLongerThan3= createLengthTest.apply(3);
        Predicate<String> isLongerThan10= createLengthTest.apply(10);

        List<String > longWords= words.stream().filter(isLongerThan10).collect(Collectors.toList());
        System.out.println(longWords);

    }
}
