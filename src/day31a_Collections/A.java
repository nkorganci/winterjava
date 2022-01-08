package day31a_Collections;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class A {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("D");
        list.add("B");
        list.add("C");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}


