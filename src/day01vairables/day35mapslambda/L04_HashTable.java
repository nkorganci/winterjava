package day01vairables.day35mapslambda;

import java.util.Hashtable;

public class L04_HashTable {

    /*
    What is the differences between "HashMap" and "L04_HashTable"?
    1- HashMap accept "null" in "key" just once and in "value" many times.
        L04_HashTable does NOT accept null in anywhere.

    2-HashMap is not thread-safe, it is single thread, you can not do multi threading, so no synchronization(fast)
      L04_HashTable is thread-safe and synchronization( slow)

    3- HashMap is almost same with L04_HashTable.

    4- Both put the elements in random order.
     */

    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Name", "Ali");
    }
}
