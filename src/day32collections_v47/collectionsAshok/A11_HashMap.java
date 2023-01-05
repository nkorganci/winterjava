package day32collections_v47.collectionsAshok;

import java.util.*;

public class A11_HashMap {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A1");
        map.put(2,"A2");
        map.put(3,"A3");

        //Print map
        System.out.println(map); // {1=A1, 2=A2, 3=A3}, uses curly braces

        //Get()
        System.out.println(map.get(1)); // enter Key, return value as a String
        String value1 = map.get(1);

        //Remove()
       String remove1= map.remove(1);
       boolean remove2 = map.remove(1,"A1");

       //ContainsKey()
        boolean contain1 = map.containsKey(1);

        //keySet()
        System.out.println(map.keySet());//[2, 3]
       Set<Integer> key1= map.keySet();

        //entryset()
        System.out.println(map.entrySet());
    }
}
