package a02Review.string;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        for (Integer a :hashSet
        ) {
            System.out.println(a);
        }
    }
}
