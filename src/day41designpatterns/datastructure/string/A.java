package day41designpatterns.datastructure.string;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('c',1);
        map.put('4',5);
        System.out.println(map.get('4'));
    }
}
