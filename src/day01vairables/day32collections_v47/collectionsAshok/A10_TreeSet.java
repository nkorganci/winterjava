package day01vairables.day32collections_v47.collectionsAshok;

import java.util.TreeSet;

public class A10_TreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(11);
        treeSet.add(2);
        treeSet.add(4);
//        treeSet.add("hi");  this can not be compared with number, gives exception
        System.out.println(treeSet);
    }
}
