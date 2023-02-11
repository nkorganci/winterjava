package day01vairables.day31interfacecollections_v46.iteratotrs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {
    /*
    1- By using loops(for, while, do while) we cannot update collections, but by using "Iterator " or "listIterator" we can.
    2- "listIterator" is more functional than "iterator"
        Iterator has no "set" method, listIterator has set method.
    3- "listIterator" and "iterator" are interfaces
    4- Inside the "iterator" we have hasNext(), next(), remove() and forEachRemaining() methods.
    5- Iterators are used to update collections.
    6- Iterator is not a class, it is an interface.
    7- There are two ways to create an object, a) new keyword , b) using another object.
    8- If you want to update list elements, we need iterator.
     */

    /* Iterator methods
    next() method jump over an element and return that element
     */
    public static void main(String[] args) {

        // By using List.of(), you can create an add methods shortly.
        //List<String> list1 = List.of("A", "C", "B");//Iteration did not accept it
        List<String> str1 = List.of("Hi", "bye");

        //1st Way
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println("Original list1: " + list1);

        for (String w : list1) {
            w = w + "x";

        }
        System.out.println(list1 + " for loop");
        System.out.println("List1 is tried to updated by for each loop: " + list1);//[A, C, B] , for-loop could not update

        //2nd Way

        List<String> it11 = List.of("A", "C", "B");
        //iterator==> Returns an array containing all of the elements in this list in proper sequence (from first to last element).
        Iterator<String> it1 = list1.iterator();//iterator is an interface, not a class.
        while (it1.hasNext()) {
            System.out.println("list1 after iteration: " + it1.next());
            System.out.println("list1 after iteration: " + it1.hasNext());
            //it1.remove();
        }


        // 3rd Way: Which is the correct way

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
           it2.next();
           it2.remove();
        }
        System.out.println(list2);

    }
}
