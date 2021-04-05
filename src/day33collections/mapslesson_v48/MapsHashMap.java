package day33collections.mapslesson_v48;

import java.util.HashMap;

public class MapsHashMap {
    /*
    1- HashMap puts the elements in random order, because of that  it is fast.
    2- Hashmap is not thread-safe; Hashmap objects can not be used in multithreading
    3- HashMap is "not synchronized" that is; HashMap objects can not be synchronized.
    4- HashMap can have a single "null" in keys part.
    5- HashMap can have multiple null values in "values" part.
    6- HashTable never accept "null" for key and value.
     */

    /*
    MAPS:
    1- Maps has "key" and "values"
    2- "key" can not be duplicated but values can, like definition of words in dictionary.
        values means number of usage, number of characters...
    3- HashMap, HashTable and TreeMap has "key" and "value" structrue
    4- Keys can have null value just once ( no duplication)
    5- Synchronization means do it in order, not at the same time.All other threads wait for the work.
    6- Maps use curly brackes
     */

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Cat",3);
        hm.put("Caterpillar",11);
        hm.put("Lion",4);
        hm.put("Tiger",5);

        System.out.println(hm);

        // keySet() returns just keys, set has no dublicate value of maps.
        System.out.println(hm.keySet());// collection: set--> best option for keys-->[Cat, Lion, Caterpillar, Tiger]

        System.out.println(hm.values());// Return just all values in collections.

    }
}
