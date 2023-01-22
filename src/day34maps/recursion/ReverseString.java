package day34maps.recursion;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseStr("hello"));
    }

    public static String reverseStr(String str) {

        if (str.isEmpty())
            return str;

        return reverseStr(str.substring(1)) + str.charAt(0);
    }

}

