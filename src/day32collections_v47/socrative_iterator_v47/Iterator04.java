package day32collections_v47.socrative_iterator_v47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {
    public static void main(String args[]){

        List<String> list = new ArrayList<>();

        list.add("AB");

        list.add("CD");

        list.add("EF");

        ListIterator<String> it = list.listIterator();

        Collections.reverse(list);

        while(it.hasNext()) {

            System.out.print(it.next() + " ");

        }

    }

}
