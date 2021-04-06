package a_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class AnimalConstructor {
//1- List<String> list1 = new ArrayList<>();, why I can not write both as list or arraylist, collections...

    /* 2-
            List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        System.out.println(numbers);
        System.out.println(printEveryElement(numbers));


    }

    public static List<Integer> printEveryElement(List<Integer> numbers) {

        numbers.add(99);
        numbers.add(91);
        return numbers;
    }
     */
    public static void main(String[] args) {

    }

    public static HashMap<String, Integer> example1(String str ) {

        HashMap<String ,Integer > map = new HashMap<>();
        String arr[] = str.split("");
        // String arr = str.split("");// Why I can not write this one.
        System.out.println(Arrays.toString(arr));

        for(String w:arr){
            if(!map.containsKey(w)){
                map.put(w,1);
            }else {
                map.put(w,map.get((w))+1);
            }
        }
        System.out.println(map);

        return null;
    }// questions

}
