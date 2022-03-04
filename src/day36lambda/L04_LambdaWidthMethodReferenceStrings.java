package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class L04_LambdaWidthMethodReferenceStrings {
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

           /*
        1-Create a method to print list elements which are starting with "A"
         */

        list.stream().filter(t -> t.startsWith("A")).map(t->t.toUpperCase()).forEach(t -> System.out.println(list + " "));

        list.stream().filter(Utils::startWithA).map(String::toUpperCase).forEach(t -> System.out.println(list + " "));

        //list.stream().filter(String::startsWith).forEach(t -> System.out.println(list + " "));
        // --> problem  String::startsWith

        /*

        "startWithA" method is very specific method. Reusability is not possible.
         Sometimes no need to use "method refernce" use "lambda expression"
        list.stream().filter(Utils.startWithA).forEach(t -> System.out.println(list + " "));

         */


    }

    public static void sortWithLength(List<String> list) {
        //3rd  create a method to print the elements in uppercases after ordering according to their lengths.
        list.stream().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));

        System.out.println();

        list.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(System.out::print);
    }

    public static void startWithAendWithO(List<String> list) {
        list.stream().filter(t -> t.startsWith("Al") || t.endsWith("no")).map(t -> t.toLowerCase()).forEach(t -> System.out.println(t + " "));

        list.stream().filter(t -> t.startsWith("Al") || t.endsWith("no")).map(t -> t.toLowerCase()).forEach(t -> System.out.println(t + " "));
    }// boolean endsWith(String suffix), true if the character sequence represented by the argument is a suffix of the character

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

    public static void printElLengthGreaterThanFive(List<String> list) {

        //6th Use “Functional Programming”: print if the element length is greater than five

        list.stream().filter(t -> t.length() >= 5).forEach(t -> System.out.print(t + " "));
        System.out.println();
        list.stream().filter(t -> t.length() >= 5).forEach(t -> System.out.print(t + " "));

    }

    public static boolean checkIfAllelementsGreaterThanThree(List<String> list) {
        //7th Use “Functional Programming”: Create a method to check if the length of all elements are greater than 3.

        return list.stream().allMatch(t -> t.length() > 3);
    }

    public static boolean checkAnyLength(List<String> list) {
        //8th Use “Functional Programming”: Create a method to check if the length of any element is equal to 4.

        return list.stream().anyMatch(t -> t.length() == 3);
    }

    public static List<String> removeIfLengthLessThanFive(List<String> list) {
        /*
        if you want to use "remove()" methods , do not use stream(), work with list directly.
         */
        list.removeIf(t -> t.length() < 5);
        return list;

    }

}
