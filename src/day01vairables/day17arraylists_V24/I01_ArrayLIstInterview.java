package day01vairables.day17arraylists_V24;

import java.net.PortUnreachableException;
import java.util.*;

public class I01_ArrayLIstInterview {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(1);
        l.add(3);

        //removeDublicates(l);
        System.out.println(reverseArray(l));


    }
    public static List<Integer> removeDublicates(List<Integer> list){
        Set<Integer> removedDublicates = new LinkedHashSet<>(list);
                list.clear();
                list.addAll(removedDublicates);
                return list;

    }
    public static List<Integer> reverseArray(List<Integer> list1){

   Collections.reverse(list1);
        return list1;
    }
    public static List<Integer> reverseArray1(List<Integer> list){
        return list;
    }
}
