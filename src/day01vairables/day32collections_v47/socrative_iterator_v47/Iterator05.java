package day01vairables.day32collections_v47.socrative_iterator_v47;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator05 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(22);

        list.add(23);

        list.add(24);

        ListIterator<Integer> it = list.listIterator();

        while(it.hasNext()) {

            it.next();

        }

        while(it.hasPrevious()) {

            Integer el = it.previous();

            it.set(el = el + 3);

            System.out.print(el + " ");

        }
    }
}
