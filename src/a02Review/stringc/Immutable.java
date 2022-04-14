package a02Review.stringc;

import java.util.ArrayList;

public class Immutable {
    public static void main(String[] args) {
        // String are stored as an hashcode
        String a = new String("how are you");
        System.out.println(a.hashCode());
        a= "heel9";
        System.out.println(a.hashCode());

        //StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append("hi");
        System.out.println(sb.hashCode());
        sb.append("bye");
        System.out.println(sb.hashCode());
        System.out.println(sb.capacity());

    }
}
