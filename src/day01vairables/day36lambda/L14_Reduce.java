package day01vairables.day36lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class L14_Reduce {
    public static void main(String[] args) {
        // 1 Sum of the Integers

        //1st Way
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        int sum = num.stream().reduce(1, (a, b) -> a * b);
        System.out.println(sum);

        //2nd Way
        int sum1 = num.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        // 2 Convert string to int and sum of them
        List<String> str1 = Arrays.asList("1","2");
      int convertedNums=  str1.stream().mapToInt(a->Integer.parseInt(a)).sum();


    }
}
