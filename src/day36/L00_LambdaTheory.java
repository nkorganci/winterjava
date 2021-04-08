package day36;

import java.util.ArrayList;
import java.util.List;

public class L00_LambdaTheory {
    /*
    1- (x,y)->x+y; ==> given two integer x, y and return another integer with the sum of x and y.
     */

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(printEveryElement(numbers));


    }

    public static List<Integer> printEveryElement(List<Integer> numbers) {

        numbers.add(99);
        numbers.add(91);
        return numbers;
    }



}
