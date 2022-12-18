package day32collections_v47.collectionsAshok;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList obj1 = new ArrayList(); // initial capacity is 10
        obj1.add(1);
        obj1.add(2);
        obj1.add(3);

        // We can give size of array
        System.out.println(obj1);
        obj1.add(0); // add at the end of array
        System.out.println(obj1);
        obj1.set(0,11);
        System.out.println(obj1);
        obj1.add(0,22);
        System.out.println(obj1);




    }
}
