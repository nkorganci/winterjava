package a01codingpractice.string;

import java.util.*;
import java.util.stream.Collectors;

public class SortingStringChars {
    public static void main(String[] args) {

        sortString("bca");
    }

    public static void sortString(String str){
        //1st Way
        char[] chars= str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            list.add(str.charAt(i));
        }
        List<Character> l=  list.stream().sorted().collect(Collectors.toList());
        System.out.println(l);

        //2nd Way 2 fori inner loop

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {

                if(str.charAt(i)>str.charAt(j)) {
                    char temp = chars[i];
                    chars[i]=chars[j];
                    chars[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(chars));

    }
}
