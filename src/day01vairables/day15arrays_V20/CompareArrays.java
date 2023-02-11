package day01vairables.day15arrays_V20;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = {1,2};

        //Compare array objecs, can not be same , they have different references
        System.out.println(a==b);

        //Compare contents, has same content
        System.out.println(Arrays.compare(a,b));
        System.out.println(Arrays.equals(a,b));

        //Deep Compare array
        Object[] a1 = {a};
        Object[] b1 = {b};
        System.out.println(Arrays.equals(a1,b1));
        System.out.println(Arrays.deepEquals(a1,b1));
    }
}
