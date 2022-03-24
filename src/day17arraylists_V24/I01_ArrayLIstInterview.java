package day17arraylists_V24;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class I01_ArrayLIstInterview {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(1);
        l.add(2);
        removeDublicates(l);
        System.out.println(l);

    }
    public static List<Integer> removeDublicates(List<Integer> list){

        Set<Integer> removedDublicates = new LinkedHashSet<>(list);
                list.clear();

                list.addAll(removedDublicates);

                return list;

    }
}
