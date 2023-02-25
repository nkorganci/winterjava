package day01vairables.day38methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer>   list  = Arrays.asList(1,4,9,0);

        Consumer<Integer> consumer = s->  System.out.println(s);

        //list.forEach(s-> System.out.println(s));
        list.forEach(System.out::println);
    }
}
