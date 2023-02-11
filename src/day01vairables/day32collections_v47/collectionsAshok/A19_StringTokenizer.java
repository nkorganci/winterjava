package day01vairables.day32collections_v47.collectionsAshok;

import java.util.StringTokenizer;

public class A19_StringTokenizer {
    public static void main(String[] args) {
        String str = "a b c";
        StringTokenizer t = new StringTokenizer(str);

        System.out.println(t);

        // You can print all
        while (t.hasMoreTokens()){
            System.out.println(t.nextToken());
        }

        // You can prin
        System.out.println("Next Token is : " + t.nextToken());
    }
}
