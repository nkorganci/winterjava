package a01codingpractice.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        nonRepeatedChar("helloo");

    }

    public static void nonRepeatedChar(String str) {

        //1st Way
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                }
            }

            if (unique) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
