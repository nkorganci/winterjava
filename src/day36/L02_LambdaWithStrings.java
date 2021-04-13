package day36;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L02_LambdaWithStrings {

    /*
        1- Comparator.comparing(t -> t.length()--> Comparator is a class and has methods like comparing to decide conditions
        2-  list.parallelStream()--> can be used all except sorting.
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");

    }

    public static void startWithA(List<String> list) {

        //1-Create a method to print list elements which are starting with "A"
        list.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.println(list + " "));

        //2-Create a method to print list elements which are starting with "A" in uppercases
        list.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.println(t.toUpperCase() + " "));


    }// boolean startsWith(String prefix), Tests if this string starts with the specified prefix.

    public static void startWithAendWithO(List<String> list) {
        list.stream().filter(t -> t.startsWith("Al") || t.endsWith("no")).map(t -> t.toLowerCase()).forEach(t -> System.out.println(t + " "));
    }

    public static void sortWithLength(List<String> list) {
        //Create a method to print the elements in uppercase after ordering according to their lengths.

        //Stream<T> sorted(Comparator<? super T> comparator)
        //Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.

        list.stream().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.println(t + " "));// sort() alphabetic order.

        list.stream().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));
    }

    public static void sortWithLastCharacters(List<String> list) {
        //4th
        list.stream().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).forEach(t -> System.out.print(t + " "));
    }

    public static void lengthOfEveryElement(List<String> list) {
        //5th Use “Functional Programming”
        // 5)Create a method to print the length of every element in the following format.
        // Sort by length.	  Ali: 3        Mark: 4       Amanda: 6     etc.

        list.stream().sorted(Comparator.comparing(t -> t.length())).
                map(t -> t + " : " + t.length()).forEach(t -> System.out.print(t + " "));

    }

    public static void printIfLessThanFive(List<String> list) {
        //6th Use “Functional Programming”: print if the element length is less than five

        list.stream().filter(t->t.length()>5).forEach(t-> System.out.println(t + " "));


    }

    public static boolean checkIfAllelementsGreaterThanThree(List<String> list) {
        //7th Use “Functional Programming”: Create a method to check if the length of all elements are greater than 3.
        return list.stream().allMatch(t -> t.length() > 3);
    }

    public static boolean checkAnyLength(List<String> list) {
        //8th Use “Functional Programming”: Create a method to check if the length of any element is equal to 4.

        return list.stream().anyMatch(t -> t.length() == 3);
    }

    public static void lengthOfEveryElementWithLength(List<String> list2){
        list2.stream().sorted(Comparator.comparing(t->t.length())).map(t->t + ": " +t.length()).forEach(t-> System.out.println(t+ " "));


    }

}
