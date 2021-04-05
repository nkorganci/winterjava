package day35mapslambda;

import java.util.Hashtable;

public class HashTable {

    /*
    What is the differences between "HashMap" and "HashTable"?
    1- HashMap accept "null" in "key" just once and in "value" many times.
        HashTable does NOT accept null in anywhere.

    2-HashMap is not thread-safe, it is single thread, you can not do multi threading, so no synchronization(fast)
      HashTable is thread-safe and synchronization( slow)

    3- HashMap is almost same with HashTable.

    4- Both put the elements in random order.
     */

    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Name", "Ali");
    }
}
