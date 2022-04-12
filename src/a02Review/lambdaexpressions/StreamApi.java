package a02Review.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        l.stream().forEach(i-> System.out.println(i));
        l.stream().filter(num->num>2).forEach(num-> System.out.println(num));
    }
}
