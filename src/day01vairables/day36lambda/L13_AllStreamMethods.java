package day01vairables.day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L13_AllStreamMethods {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(0);
        l1.add(3);
        l1.add(4);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);


        List<Integer> x = l1.stream().limit(3).collect(Collectors.toList());
                           Optional<Integer> m=  l1.stream().filter(r->r>0).max(Integer::compareTo);
        System.out.println(m.get());

    }

    public static void filter(List<Integer> list){
        //Bigger than
        List<Integer> res = list.stream().filter(t->t>2).collect(Collectors.toList());
        List<Integer> res1 = list.stream().sorted().filter(t->t>2).collect(Collectors.toList());
        System.out.println(res);

    }

    public static void map(List<Integer> list){

        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(0);
        l1.add(3);
        l1.add(4);

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        List<List<Integer>> r = Arrays.asList(l1,l2);
        r.stream().flatMap(t->t.stream()).map(t->t*4).collect(Collectors.toList());

    }

    public static void math(List<Integer> a){


    }
}
