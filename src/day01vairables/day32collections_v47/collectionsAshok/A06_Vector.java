package day01vairables.day32collections_v47.collectionsAshok;

import java.util.Enumeration;
import java.util.Vector;

public class A06_Vector {
    public static void main(String[] args) {
        Vector<Integer> vector= new Vector<>();
        vector.add(10);
        vector.add(11);
        vector.add(12);
        System.out.println(vector);


       Enumeration<Integer> elementsofVector= vector.elements();
       while (elementsofVector.hasMoreElements()){
           System.out.println(elementsofVector.nextElement());
       }
    }
}
