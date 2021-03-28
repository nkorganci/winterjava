package day31interfacecollections.iteratotrs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {
    /*
    1- By using loops we cannot update collections, but by using "Iterator " or "listIterator" we can.
    2- "listIterator" is more functional thank "iterator"
    3- "listItertor" and "iterator" are interfaces
    4- Inside the "iterator" we have hasNext(), next(), remove() and forEachRemaining() methods.
     */
    public static void main(String[] args) {

        //1st Way
        // By using List.of(), you can create an oadd methods shortly.
        //List<String> list1 = List.of("A", "C", "B");//Iteration did not accept it
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("C");
        list1.add("B");
        System.out.println(list1);// [A, C, B]

        for (String w : list1) {
            w = w + "x";
        }
        System.out.println(list1);//[A, C, B] , forloop could not update

        //2nd Way

        List<String> ti1 = List.of("A", "C", "B");
        Iterator<String> it1 = list1.iterator();//iterator is an interface, not a class.
        while (it1.hasNext()) {
            it1.next();
            it1.remove();
        }
        System.out.println(it1);
    }
}
