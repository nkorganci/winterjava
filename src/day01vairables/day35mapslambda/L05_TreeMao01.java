package day01vairables.day35mapslambda;

import java.util.TreeMap;

public class L05_TreeMao01 {
    /*
        1- ThreeMap puts the elements in natural order.
        2- TreeMap uses "keys" to put elements in natural order.
        3- TreeMap is not thread-safe, and is not  "synchronized".
        4- TreeMap allows to use null in values many times, but does not allow you to use null in "keys".
            E.g: Students must write their first and last name but my not write their address or other some info.
        5- TreeMap is slow
        6- Entry means key and value
     */

    public static void main(String[] args) {
        TreeMap<Integer ,String> tm = new TreeMap<>();

        tm.put(1, "Ali");// V put(K key, V value)
        tm.put(2, "Ayse");
        tm.put(4, "Veli");
        tm.put(3, "Ali");
        tm.put(5, "Hakan");
        System.out.println(tm);

        System.out.println(tm.ceilingEntry(2));//It return that element (key and value)
        System.out.println(tm.ceilingEntry(55));//If there is no this Key, it return next Key.
        System.out.println(tm.ceilingEntry(3343)); // If key is greater than all of them, it return "null"

        System.out.println(tm.ceilingKey(22));// K ceilingKey(K key), generic method, K can be any variable and return that variable.

        System.out.println(tm.floorEntry(7));//6=Hakan, return previous Key

        System.out.println(tm.descendingKeySet()); //[44, 6, 5, 2]

        System.out.println(tm.firstEntry());//2=Ayse


        System.out.println(tm.floorKey(4)); //??

        System.out.println(tm.headMap(6));// Write after Key values which is exclusive, {2=Ayse, 5=Veli, 6=Hakan} , return the previous elements as sorted. Key exclusive
        //SortedMap<K,V> headMap(K toKey)
        System.out.println(tm.headMap(12, true));//  12 is inclusive at this time

        System.out.println(tm.tailMap(6));//Write previous values inclusive {6=Hakan, 44=Ali}, bigger or equal than Key
        System.out.println(tm.tailMap(2, false)); //Not inclusive at this time.
    }
}
