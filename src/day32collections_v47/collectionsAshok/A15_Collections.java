package day32collections_v47.collectionsAshok;

import java.util.ArrayList;
import java.util.Collections;

public class A15_Collections {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);

//        arrayList.sort();
        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        System.out.println(arrayList);


    }
}
