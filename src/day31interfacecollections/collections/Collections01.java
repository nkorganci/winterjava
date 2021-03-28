package day31interfacecollections.collections;

import java.util.LinkedList;
import java.util.List;

public class Collections01 {
    /*
    LinkedList: 1)It is a class
                   2)It is good at "adding" and "removing" elements
                   3)Every element is connected with eachother
                   4)Every element has "data" and "pointer" parts
                   5)Elements are called as "node"
                   6)Every linkedlist has "head" part, "head" has just "pointer" part
                   7)Last element is called "tail" in linkedlist, it points "null"
                   8)It is not successfull in searching elements and updating elements.
     */

    public static void main(String[] args) {
        List<String> ll1 = new LinkedList<>();
        ll1.add(0,"A");
        ll1.add(0,"B");
        System.out.println(ll1);
    }
}
