package day41designpatterns.datastructure.chase;

import java.util.HashMap;
import java.util.Map;

public class ReorganizeString {

    public static void main(String[] args) {

    }

    public static String arrayStrings(String s){


        Map<Character,Integer> counts = new HashMap<>();

        for(char c:s.toCharArray()){
            counts.put(c,counts.getOrDefault(c,0)+1);
        }

        return "hi";
    }
}
