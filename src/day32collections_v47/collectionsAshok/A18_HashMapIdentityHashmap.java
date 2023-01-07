package day32collections_v47.collectionsAshok;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class A18_HashMapIdentityHashmap {
    public static void main(String[] args) {

        //============ hashMap is fail fast
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");

        System.out.println(hashMap);

        Set<Integer> key= hashMap.keySet();
        Iterator<Integer> iterator= key.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//            hashMap.put(4,"four");
//        }

        //=============== concurrentHashmap is FAIL SAFE, you can add new items when it traverse

        ConcurrentHashMap<Integer,String > concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(2,"h");

        //================ identity hashmap accept duplicate value
        IdentityHashMap<Integer,String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(12,"3y");
        identityHashMap.put(22,"4y");
        identityHashMap.put(32,"5y");
        identityHashMap.put(32,"5y");
        identityHashMap.put(new Integer(32), "new"); //
        System.out.println("identity "+identityHashMap);
        System.out.println(identityHashMap.size());




    }
}
