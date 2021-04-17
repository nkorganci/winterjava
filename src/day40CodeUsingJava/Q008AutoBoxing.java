package day40CodeUsingJava;

import java.util.ArrayList;
import java.util.List;

public class Q008AutoBoxing {
}

class Test {
    /*
    When we use autoboxing valueOf is implemented such that certain numbers are "pooled",
    and it returns the same instance for values smaller than 128. Autoboxing caches -128 to 127.
    Remember when dealing with objects is - use .equals if you want to check if the two
    objects are "equal", use == when you want to see if they point to the same instance.
     */

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<Integer>();

        testList.add(127);
        testList.add(127);

        testList.add(128);
        testList.add(128);

        testList.add(12);
        testList.add(12);


        //System.out.println(testList);

        System.out.println(testList.get(0) == testList.get(1));
        System.out.println(testList.get(2) == testList.get(3));//false because only -127-12/

        System.out.println(testList.get(4) == testList.get(5));

//        System.out.println(testList.get(0).equals(testList.get(1)));
//        System.out.println(testList.get(2).equals(testList.get(3)));
    }
}