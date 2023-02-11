package day01vairables.day40CodeUsingJava;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int[] array1 = {4, 0, 0};
        int[] array2 = {3, 10, 5};
        System.out.println(
       //Arrays.compare(array1, array2) + Arrays.mismatch(array1, array2) + Arrays.equals(array1, array2));
       Arrays.compare(array1, array2) + Arrays.mismatch(array1, array2) );
        //equals retrun boolean, operator can not be used
    }
}


