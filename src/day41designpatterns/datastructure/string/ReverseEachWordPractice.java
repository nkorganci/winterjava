package day41designpatterns.datastructure.string;

import day01vairables.day10forloops.WhileLoop01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordPractice {
    public static void main(String[] args) {

        System.out.println(reverseStringWords("Hello World"));
        System.out.println(reverseString2("Hello World"));
        System.out.println(reverseString3("hello world daa"));

    }

    //1st Way String [] arr
    public static String reverseStringWords(String text) {

        String[] words = text.split(" ");
        String reversedWords = "";

        for (String w : words) {
            String a = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                a += w.charAt(i);
            }
            reversedWords += a + " ";
        }

        return reversedWords;
    }

    // 2nd Way via StringBuilder
    public static String reverseString2(String text) {

        String [] words = text.split(" ");
        String r ="";

        for (String w: words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            r +=sb +" ";
        }
        return r;

    }

    public static String reverseString3(String text){

        return Arrays.asList(text.split(" ")).stream().map(a-> new StringBuilder(a).reverse()).collect(Collectors.joining(","));
    }


}
