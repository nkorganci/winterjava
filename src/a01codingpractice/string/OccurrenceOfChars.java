package a01codingpractice.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfChars {
    public static void main(String[] args) {
        findOccurrenceOfEachChar("Hello");

    }

    public static void findOccurrenceOfEachChar(String str) {

        //1st Way , Map
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : chars) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int count = map.get(ch);
                map.put(ch, count + 1);

            }
        }// End of loop
        System.out.println(map);

        //2nd Way Lambda expression


    }
}
