package day34maps;

import java.util.HashMap;

public class Maps01 {

    public static void main(String[] args) {

        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 3);
        hm1.put("caterpillar", 11);
        hm1.put("lion", 4);
        hm1.put("tiger", 5);
        hm1.put("cat", 999);

        System.out.println(hm1);

        HashMap<String, Integer> hm2 = new HashMap<>();
        hm1.put("cat", 3);
        hm1.put("caterpillar", 11);
        hm1.put("lion", 4);
        hm1.put("tiger", 5);

        System.out.println(hm2);// Map, {caterpillar=11, cat=3, tiger=5, lion=4}

        System.out.println(hm1.keySet());
        System.out.println(hm1.values());

        System.out.println(hm1.containsKey("cat"));
        System.out.println(hm1.containsValue(11));

        System.out.println(hm1.entrySet());//Collections, [caterpillar=11, cat=3, tiger=5, lion=4]

        //equals() does not check order of elements.
        System.out.println(hm1.equals(hm2));// can be correct or false, order will not be same.

        //to get value of a specific key, use get() method.
        //get() method works with all type of data
        System.out.println(hm1.get("cat"));
        System.out.println(hm1.get("snake"));//non existing elements return null

        // getOrDefault() method returns the value if the key exists otherwise returns the given value which is used in method call.
        System.out.println(hm1.getOrDefault("snake",404));

        hm1.putAll(hm2);
        System.out.println(hm1);

        //compute() method is used to update value of a specific key( only its value)
        hm1.compute("lion",(key, value)-> value + 5);
        hm1.compute("tiger",(key, value)-> value =555);
        hm1.compute("tiger",(key, value)-> key.length() + 11);
       // hm1.compute("tiger",(key, value)-> key +"Ali Can");//compute method can not update key, only value
        System.out.println(hm1);

        hm1.computeIfPresent("caterpillar",(key, value)-> value+9);
        System.out.println(hm1);

        //computeIfPresent() method updates the value of key, if the key exists.
        //If the key does not exist it does not do anything.
        hm1.computeIfPresent("caterpillarXX",(key, value)-> value+9);
        System.out.println(hm1);


        //executed if the key does not exist, if the key exists it does not run.
        hm1.computeIfAbsent("snake", k->5);
        System.out.println(hm1);

        hm1.putIfAbsent("cat",1000);//nothing will be done
        System.out.println(hm1);

        hm1.putIfAbsent("catZZZZ",1000);//It will add.
        System.out.println(hm1);






    }
}
