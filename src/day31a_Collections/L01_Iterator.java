package day31a_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class L01_Iterator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);

         Iterator it = list.iterator();

         while (it.hasNext()){
             Integer i = (Integer) it.next();
             if(i<2){
                 it.remove();
             }

         }

        System.out.println(list);


    }
}
