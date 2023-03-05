package day41datastructurealgorith.string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateChars {
    public static void main(String[] args) {

        removeDuplicate("hello");

    }

    public static void removeDuplicate(String str){
        //1st Way
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = 0; j < str.length()-1; j++) {
                if(i!=j&&str.charAt(i)!=str.charAt(j)){
                    result += str.charAt(i);
                }
            }
        }
        System.out.println(result);

        //2nd Way
        List<String> list = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            list.add(str.substring(i,i+1));
        }
       List<String> unique= list.stream().distinct().collect(Collectors.toList());
        String joinList = String.join("",unique);
        System.out.println("JoinList:   " + joinList);

        //3rd Way Set Interface
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            set.add(str.substring(i,i+1));
        }
        System.out.println(set);
        String joined = String.join("",set);
        System.out.println("Joined "+joined);

        //4th Way StringBuilder
        StringBuilder sb  = new StringBuilder();
        str.chars().distinct().forEach(t->sb.append((char)t));
        System.out.println(sb);

        //5th Way StringBuilder with inner for loop
        StringBuilder sb2  = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            boolean repeated = false;
            for (int j = i+1; j <str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)){
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                sb2.append(str.charAt(i));
            }
        }
        System.out.println(sb2);

        // Set

        Set<Character> set1 = new LinkedHashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            set1.add(str.charAt(i));
        }
        for(Character ch : set1){
            sb.append(ch);
        }

        }


    }

