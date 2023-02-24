package day01vairables.day37functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",","[","]");
        joinNames.add("a");
        joinNames.add("a");
        joinNames.add("a");

        System.out.println(joinNames);

        //StringJoiner in StreamApi

        List<String> list = Arrays.asList("a","b","school");
        String a = list.stream().map(a2->a2+1).collect(Collectors.joining(" "));
        System.out.println(a);
    }
}
