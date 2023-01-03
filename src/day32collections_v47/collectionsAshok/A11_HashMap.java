package day32collections_v47.collectionsAshok;

import java.util.*;

public class A11_HashMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap= new HashMap<>();
        hashMap.put(1,"Adam1");
        hashMap.put(2,"Adam2");
        hashMap.put(3,"Adam3");
        hashMap.put(3,"Adam4");

        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap);

        //Print value
        System.out.println("Key " + hashMap.get(1));


        //Get only Keys, keySet return Set
      Set<Integer> keys= hashMap.keySet();
      for(Integer k:keys){
          System.out.println(k);
          System.out.println(hashMap.get(k));
      }

      // map.values return collections
        Collection<String> values= hashMap.values();


      // map.entrySet() --> to get key and values
       Set<Map.Entry<Integer,String>> entrySet= hashMap.entrySet();
    }
}
