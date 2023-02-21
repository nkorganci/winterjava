package day41designpatterns.datastructure.string;

import java.util.*;

public class OccurenceOfEachChar {
    public static void main(String[] args) {

        System.out.println(o("hello000"));

    }

    public static Map<Character, Integer> o(String str) {

        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (Character c : ch) {
            if (map.containsKey(c)) {
                int inx = map.get(c);
                map.put(c, inx + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
