package day01vairables.day32collections_v47.socrative_iterator_v47;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            Object el = it.next();
            it.remove();
        }
       System.out.println(list);
    }
}
