package day33collections.mapslesson_v48;

import java.util.HashMap;

public class MapsHashMap {


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
                                        // As you see java does not use set can use link because values can be multiple
                                        // Values use collections, linkList,ArrayList, PriorityQueue..Except "set"



    }
}
