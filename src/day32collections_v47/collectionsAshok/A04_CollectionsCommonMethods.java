package day32collections_v47.collectionsAshok;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A04_CollectionsCommonMethods {
    public static void main(String[] args) {
        //========================LIST==========================================
        List<Integer> list = new ArrayList<>();

        //ADD
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //REMOVE
        list.remove(1);
        System.out.println(list);

        //GET
        int f = list.get(0);
        System.out.println(f);

        //SET
        list.set(0,3);
        System.out.println(list);

        //INDEXOF
        int indexofelement = list.indexOf(3);
        System.out.println(indexofelement);

        //=================================SET ==================================
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(7);
        set.add(2);
        System.out.println(" SET : " +set);
        set.remove(7);// Remove specified element
        System.out.println(" SET : " +set);






    }
}
