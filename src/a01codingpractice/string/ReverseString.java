package a01codingpractice.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        reverseString("123");
    }

    public static void reverseString(String str) {

        byte[] b = str.getBytes();
        System.out.println(Arrays.toString(b));

        char[] c = str.toCharArray();
        System.out.println(Arrays.toString(c));

        // 1st way charArray
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(c[i]);
        }

        //2nd Way
        String reverseSr ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverseSr +=str.charAt(i);

        }
        System.out.println();
        System.out.println(reverseSr);

        //3rd Way
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        //4th Way
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }


}
