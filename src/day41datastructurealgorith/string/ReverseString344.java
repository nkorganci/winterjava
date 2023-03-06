package day41datastructurealgorith.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString344 {
    public static void main(String[] args) {
        reverseString(new char[]{'a', 'b', 'c'});

    }

    public static void reverseString(char[] s) {

        int left=0;
        int right =s.length-1;

        while (left<=right){
           char temp= s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;

        }
        System.out.println(s);
    }

}
