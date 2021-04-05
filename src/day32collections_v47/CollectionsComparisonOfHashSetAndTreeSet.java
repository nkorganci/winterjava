package day32collections_v47;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsComparisonOfHashSetAndTreeSet {
    /*
     * Create a collection which has sorted unique elements...
     * 1.way: Use TreeSet directly but this way will be very slow
     * 2.way: Use HashSet to create Collection then convert HashSet to TreeSet to put elements in order
     * 3. If you want to get sorted elements, use HashSet and convert it to TreeSet
     */
    public static void main(String[] args) {
        //1st Way
        TreeSet<Integer> ts1 = new TreeSet<>();

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            ts1.add((2 * i));

        }
        System.out.println(ts1.size());
        long end1 = System.currentTimeMillis();

        System.out.println(end1 - start1);// 7 millisecond


        //2nd Way

        HashSet<Integer> hs1 = new HashSet<>();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            hs1.add(2 * i);
        }
        System.out.println(hs1.size());

        // I am converting Hashset to TreeSet
        //TreeSet<Integer> tFromHashSet = new TreeSet<>(hs1);// It was supposed to decrease time but increased

        long endtime2 = System.currentTimeMillis();

        System.out.println(endtime2 - start2);// 2 millisecond


    }
}
