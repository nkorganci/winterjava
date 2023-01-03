package day32collections_v47.collectionsAshok;

import java.util.HashSet;
import java.util.Iterator;

public class A08_Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        System.out.println(hashSet);
        hashSet.add(null);
        hashSet.remove(1);// remove the given element, it is not index
        System.out.println(hashSet);

        //HashSet for String
        HashSet<String> hs = new HashSet<>();
        hs.add("hi");
        hs.add("hi1");
        hs.add("hi2");
        hs.add(null);
        System.out.println(hs);
        hs.remove("hi");
        System.out.println(hs);

        // We can create 3 constructors depends on our requirements
        HashSet hs1 = new HashSet();
        HashSet hs2 = new HashSet(22);
        HashSet hs3  = new HashSet(44,2);

        //Only Iterator is used for Set
       Iterator iterator= hashSet.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }
}
