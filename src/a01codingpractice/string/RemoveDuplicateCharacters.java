package a01codingpractice.string;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        removeDuplicateChar("12333");

    }

    public static void removeDuplicateChar(String str){

        //1 StringBuilder
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(t->sb.append((char)t));
        System.out.println(sb);

        //2nd charArray
        char[] chars = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j <str.length() ; j++) {
                if(chars[i]==chars[j]){
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                sb2.append(chars[i]);
            }
        }
        System.out.println(sb2);

        // 3rd Way  Set
        StringBuilder sb3 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);

        for(Character c : set){
            sb3.append(c);
        }

        System.out.println(sb3);
    }


}
