package a01codingpractice.string;

import a02Review.lambdaexpressions.Functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachCharacter {

    public static void main(String[] args) {

        occurrenceOfChars("Hello");


    }

    public static void occurrenceOfChars(String str){

        //1st Way
        List<String> list = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            list.add(str.substring(i,i+1));
        }
        Map<String, Long> hashMap= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(hashMap);

        //2nd Way
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for(char ch :chars){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                int value = map.get(ch);
                map.put(ch,value+1);
            }
        }

        System.out.println(map);
    }
}
