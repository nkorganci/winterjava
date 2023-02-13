package day41designpatterns.datastructure.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRepeatedChars {
    public static void main(String[] args) {
        removeRepeatedChar("hello");

    }

    public static void removeRepeatedChar(String str){

        Set<String> stringSet= new LinkedHashSet<>();

        for (int i = 0; i <str.length() ; i++) {
            stringSet.add(str.substring(i,i+1));
        }
        System.out.println(stringSet);

        String join= String.join("",stringSet);
        System.out.println(join);
    }
}
