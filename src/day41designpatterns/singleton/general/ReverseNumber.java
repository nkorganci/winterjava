package day41designpatterns.singleton.general;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseNumber(123888));
    }

    public static int reverseNumber(int num){

        String str = Integer.toString(num);
        char[] chars= str.toCharArray();
        char[] chars1 = new char[chars.length];
        for (int i = 0; i <chars.length ; i++) {
            chars1[i]=chars[chars.length-i-1];
        }

        String strReversed = String.valueOf(chars1);
        int numReversed = Integer.parseInt(strReversed);

        return numReversed;
    }
}
