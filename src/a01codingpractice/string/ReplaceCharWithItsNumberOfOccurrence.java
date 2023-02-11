package a01codingpractice.string;

import java.util.Arrays;

public class ReplaceCharWithItsNumberOfOccurrence {
    public static void main(String[] args) {

        replace("Hello", 'l');
    }

    public static void replace(String str, char ch) {
        char[] chars = str.toCharArray();
        int count =1;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)==ch){
                chars[i]=String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(Arrays.toString(chars));

        int a = 23;
        String b = String.valueOf(a);
        System.out.println("a :"+b);
    }
}
