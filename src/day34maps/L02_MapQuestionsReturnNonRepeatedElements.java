package day34maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L02_MapQuestionsReturnNonRepeatedElements {

    /*
    Create a method to return non-repeated elements from a list
    Example: Hellooo ==> [H, e]

     */


    public static void main(String[] args) {

        System.out.println(getNonRepeatedChars("Hellooo"));
    }

    public static List<Map.Entry<String, Integer>> getNonRepeatedChars(String str) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>();
       //list<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        String arr[] = str.split("");

        for (String w: arr){

            map.computeIfPresent(w, (key, value)-> value+1);
            map.computeIfAbsent(w,k->1);
        }
        //EntrySet return set
        for(Map.Entry<String, Integer> w : map.entrySet()){
            if(w.getValue()==1){
                list.add(w);
            }
        }

        return list;
    }


}
