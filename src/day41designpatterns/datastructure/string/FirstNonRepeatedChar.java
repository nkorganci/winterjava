package day41designpatterns.datastructure.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        System.out.println(findFirstNonRepeatedChar("hheelo"));

    }

    public static int findFirstNonRepeatedChar(String str) {

        char[] c = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        int n = str.length();

        for (Character ch : c) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < n; i++) {

            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }

    public static int firstUniqueChar(String str) {

        // Stores the lowest index / first index
        int ans = Integer.MAX_VALUE;

        // Iterate from a to z which is 26 which makes it constant
        for (char c = 'a'; c <= 'z'; c++) {
            //indexOf will return first index of alphabet, lastIndexOf will return last
            int index = str.indexOf(c);
            if (index != -1 && index == str.lastIndexOf(c)) {
                ans = Math.min(ans, index);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
