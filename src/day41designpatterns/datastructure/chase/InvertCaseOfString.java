package day41designpatterns.datastructure.chase;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class InvertCaseOfString {
    // Question: I want to change a String so that all the uppercase characters become lowercase,
    // and all the lower case characters become uppercase. Number characters are just ignored.
    public static void main(String[] args) {

        System.out.println(reverseCase("aaAA"));
        System.out.println(reverseCase1("aaAA"));

    }
    //1st Way Character bytes
    public static String reverseCase(String str){
        char[] chars = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        String n = new String(chars);
        String n1 = String.valueOf(chars);
        return n1;

    }
    //2nd Way StringBuilder
    public static String reverseCase1(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                c=Character.toLowerCase(c);
            }else {
                c=Character.toUpperCase(c);
            }
            sb.append(c);
        }

        return sb.toString();
    }

    //3rd Way map
}
