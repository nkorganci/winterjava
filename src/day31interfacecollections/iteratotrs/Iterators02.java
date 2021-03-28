package day31interfacecollections.iteratotrs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {
    public static void main(String[] args) {

        List<String> list2 = new ArrayList<>();
        list2.add("AB");
        list2.add("CD");
        list2.add("EF");
        System.out.println(list2);

        // Let us add "!" at the end of every element

        Iterator<String> it2 = list2.iterator();

        while (it2.hasNext()) {

            String el = it2.next();
            System.out.println(el);

            //el = el + "1";// Did not update

            setMethod();
            reverseElements();
        }

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
            System.out.println(el);

            it2.set(el + "!");
        }
        System.out.println(list2);
    }

    public static void reverseElements() {
        List<String> list3 = new ArrayList<>();
        list3.add("XY");
        list3.add("ZT");
        list3.add("UV");
        System.out.println(list3);

        //Let us print list elements one by one in reverse order by putting space between two elements
        //[XY, ZT, UV] ==> UV ZT XY
        ListIterator<String> it3 = list3.listIterator();

        //Take the pointer to end
        //If you dont use hasNext() and next(), loop will be infinite.
        while (it3.hasNext()) {
            it3.next();
        }

        while (it3.hasPrevious()) {

            String el = it3.previous();

            System.out.print(el + " ");//UV ZT XY

        }

    }

}

