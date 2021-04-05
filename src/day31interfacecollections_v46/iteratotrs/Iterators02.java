package day31interfacecollections_v46.iteratotrs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {
reverseElements();
    }

    public static void setMethod() {

        List<String> list2 = new ArrayList<>();
        list2.add("AB");
        list2.add("CD");
        list2.add("EF");
        System.out.println(list2);

        // Let us add "!" at the end of every element

        ListIterator<String> it2 = list2.listIterator();

        while (it2.hasNext()) {

            String el = it2.next();
            it2.set(el + "!");
        }
        System.out.println(list2);


    }

    public static void reverseElements() {
        /*
         Let us print list elements one by one in reverse order by putting space between two elements
         [XY, ZT, UV] ==> UV ZT XY
         */

        List<String> list3 = new ArrayList<>();
        list3.add("XY");
        list3.add("ZT");
        list3.add("UV");
        System.out.println(list3);

        ListIterator<String> it1 = list3.listIterator();
        //Take the pointer to end
        while (it1.hasNext()){
            it1.next();
        }

        //By using hasPrevious() and previous(), we can work with the collection elements in reverse order.
        while (it1.hasPrevious()){
            String el = it1.previous();
            System.out.print(el + " ");
        }

    }
}



