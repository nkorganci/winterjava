package day32collections_v47;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionsSetHashSetLinkedHashSetTreeSet1 {
     /*
        Hashing Technique: It is a technique to create unique codes for every element in a collection
        [ "A", "B", "A", "C" ]
    */

    /*
        1)Set Interface has 3 implementations a)HashSet b)LinkedHashSet c)TreeSet
        2)Set means "no duplication"
        3)Tree means sorted in "natural order" and unique
        4)"natural order" means ascending order for numbers, alphabetical order for characters
        5- null is the element of ALL CLASSES
    */

    /*
        HashSet:
        1)HashSet does not put the elements in any order. It puts elements in random order. It is fast.
        2)HashSet does not contain repeated elements
        3)"null" can be used in HashSet just once

    */

    /*
        LinkedHashSet:
        1)LinkedHashSet puts the elements in "insertion order"
        2)LinkedHashSet does not contain repeated elements
        3)"null" can be used in LinkedHashSet just once
    */

    /*
       TreeSet:
       1)TreeSet puts the elements in "natural order"
       2)TreeSet does not contain repeated elements
       3)"null" can be used in TreeSet just once
       4)TreeSet is super slow because of that we do not prefer to use TreeSet even we need sorted collection
    */

    public static void main(String[] args) {
linkedHashSet();



    }
    public static void linkedHashSet(){

        //It keeps insertion order
        LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();
        lhSet.add(1);
        lhSet.add(3);
        lhSet.add(2);
        System.out.println(lhSet);

    }
    public static void hashSet(){

        /*
        By selecting data type as object or by not declaring data type,
        you can store multiple data types in all Collection (list, queue, set)
        But not recommended, better to write data type. And a single data type.

         */

        HashSet hSet = new HashSet<>();
        hSet.add(2);
        hSet.add("Hi");
        hSet.add('c');
        System.out.println(hSet);

        HashSet<Object> hSet1 = new HashSet<>();
        hSet1.add(2);
        hSet1.add("Hi");

        System.out.println(hSet1.add('c'));// true, added
        hSet1.add('c');//will give false, Repeated elements will not be written, no doublicate elements

        hSet1.add(null);// null also can be added just once.
        hSet1.add(null);// will not add repeated elments.

        System.out.println(hSet1);

    }
    public static void treeSet(){

        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(12);
        tSet.add(-12);
        tSet.add(32);
        tSet.add(0);
        System.out.println(tSet);//[-12, 0, 12, 32]
    }
}
