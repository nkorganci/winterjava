package day32collections_v47.collectionsAshok;

import java.util.ArrayList;

public class ListClass {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); // default capacity is 10
        list1.add(1);
        list1.add("hi");

        System.out.println(list1);
        System.out.println(list1.get(1));

        //Printing elements
        // 1st way
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }

        // 2nd Way
        for(Object name: list1){
            System.out.println(name);
        }
    }
}
