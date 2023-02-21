package day01vairables.day36lambda;

import java.util.*;
import java.util.stream.Collectors;

public class L16_MatchSortFind {
    public static void main(String[] args) {

        // Sort
        List<Integer> num  = Arrays.asList(5,1,2,4);
        num.stream().sorted().collect(Collectors.toList());// Ascending order
        num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//Reverse Order

        // anyMatch(), nonMatch(), nonMatch()
        boolean a = num.stream().anyMatch(b->b>2);
        boolean b = num.stream().noneMatch(d->d<2);
        System.out.println(b);

        // Max, Min
        Integer max = num.stream().mapToInt(e->e).max().orElseThrow(NoSuchElementException::new);
        System.out.println(max);

    }
}
