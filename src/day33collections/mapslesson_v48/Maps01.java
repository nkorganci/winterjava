package day33collections.mapslesson_v48;

import java.util.HashMap;

public class Maps01{
    /*
    1- HashMap puts the elements in random order, because of that  it is fast.
    2- Hashmap is not thread-safe; Hashmap objects can not be used in multithreading
    3- HashMap is "not synchronized" that is; HashMap objects can not be synchronized.
    4- HashMap can have a single "null" in keys part.
    5- HashMap can have multiple null values in "values" part.
     */
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Cat",3);
        hm.put("Caterpillar",11);
        hm.put("Lion",4);
        hm.put("Tiger",5);

        System.out.println(hm);

        // keySet() returns just keys
        System.out.println(hm.keySet());

    }
}
