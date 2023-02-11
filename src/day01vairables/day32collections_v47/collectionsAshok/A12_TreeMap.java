package day01vairables.day32collections_v47.collectionsAshok;

import java.util.TreeMap;

public class A12_TreeMap {
    public static void main(String[] args) {

        // TreeSet() sort ascending,natural sorted order for keys
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(2,"h2");
        treeMap.put(1,"h1");
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.entrySet());

    }
}
