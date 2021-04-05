package day33collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections01 {
    	/*
	 	Create a collection which has sorted unique elements...
	 	1.Way:Use TreeSet directly but this way will be very slow
	 	2.Way:Use HashSet to create Collection then convert HashSet to TreeSet to put elements in order
	*/

    public static void main(String[] args) {

        //1.Way
        long start1 = System.currentTimeMillis();

        TreeSet<Integer> ts1 = new TreeSet<>();

        for(int i=0; i<1000000; i++) {
            ts1.add(2*i);
        }

        System.out.println(ts1.size());//10000
        long end1 = System.currentTimeMillis();

        System.out.println(end1 - start1);

        //2.Way

        HashSet<Integer> hs1 = new HashSet<>();

        for(int i=0; i<1000000; i++) {
            hs1.add(2*i);
        }
        //I am converting HashSet to TreeSet
        TreeSet<Integer> ths = new TreeSet<>(hs1);

        System.out.println(hs1.size());//10000

        long end2 = System.currentTimeMillis();

        System.out.println(end2 - end1);

    }
}
