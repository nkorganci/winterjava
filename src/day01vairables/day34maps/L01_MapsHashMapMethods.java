package day01vairables.day34maps;

import java.util.HashMap;

public class L01_MapsHashMapMethods {
       /*
    1- HashMap puts the elements in random order, because of that  it is fast.
    2- Hashmap is not thread-safe; Hashmap objects can not be used in multithreading
    3- HashMap is "not synchronized" that is; HashMap objects can not be synchronized.
    4- HashMap can have a single "null" in keys part.
    5- HashMap can have multiple null values in "values" part.
    6- L04_HashTable never accept "null" for key and value.
     */

    /*
    MAPS:
    1- Maps has "key" and "values", "key + values" = entry
    2- "key" can not be duplicated but values can, like definition of words in dictionary.
        values means number of usage, number of characters...
    3- HashMap, L04_HashTable and TreeMap has "key" and "value" structrue
    4- Keys can have null value just once ( no duplication)
    5- Synchronization means do it in order, not at the same time.All other threads wait for the work.
    6- Maps use curly brackes
    7- get() methods works with indexes in Collections, but in Maps get() method works with "key"

     */

    public static void main(String[] args) {

    }

    public static void keySetValues() {
        /*
        Associates the specified value with the specified key in this map
        If the map previously contained a mapping for the key, the old value is replaced
         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);// The last value is updated.

        // keySet() returns just keys, set has no dublicate value of maps.
        System.out.println(hm1.keySet());// collection: set--> best option for keys-->[Cat, Lion, Caterpillar, Tiger]

        System.out.println(hm1.values());// Return just all values in collections.
        // As you see java does not use set can use link because values can be multiple
        // Values use collections, linkList,ArrayList, PriorityQueue..Except "set"

    }// Set<K> keySet(),  Collection<V> values()

    public static void containKeyValues() {
        /*
        Associates the specified value with the specified key in this map
        If the map previously contained a mapping for the key, the old value is replaced
         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);// The last value is updated.

        System.out.println(hm1.containsKey("cat"));
        System.out.println(hm1.containsValue(1)); //false
        System.out.println(hm1.containsValue(11));//false
        System.out.println(hm1.containsValue(15));//True

    }

    public static void entryset() {
        /*
            Returns a Set view of the mappings contained in this map.
            The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);// The last value is updated.
        System.out.println(hm1);            //{caterpillar=2, cat=15, tiger=4, lion=3}, MAP

        // entrySet() convert map-->to collection, so we can use collection methods.
        System.out.println(hm1.entrySet());// [caterpillar=2, cat=15, tiger=4, lion=3], COLLECTION


    }//Set<Map.Entry<K,V>> entrySet(), set value contain Map

    public static void equals() {
        /*

         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);// The last value is updated.

        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("cat", 1);
        hm2.put("cat", 1);
        hm2.put("caterpillar", 2);
        hm2.put("lion", 3);
        hm2.put("tiger", 4);
        hm2.put("cat", 11);
        hm2.put("cat", 15);// The last value is updated.

        System.out.println(hm1.equals(hm2));//True, it does not check repeated elements


    }// boolean equals(Object o)

    public static void get1() {
        /*
            get() takes any kind of data because it get Object.
         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);

        System.out.println(hm1.get("get"));// takes key, return its value.// result: null( for non existing element)
        System.out.println(hm1.get("cat"));// takes key, return its value.// result: 15


    }// V get(Object key)

    public static void getOrDefault() {
        /*

         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);

        System.out.println(hm1.getOrDefault("cat", 33));//Return the last value: 15,
        System.out.println(hm1.getOrDefault("Hi", 35));//return given value if non exist: 35, non existing element


    }// V getOrDefault(Object key, V defaultValue)

    public static void putAll() {
        /*
        Copies all of the mappings from the specified map to this map.
        These mappings will replace any mappings that this map had for any of the keys currently in the specified map.

         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);

        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("cat", 3);// value 3 is updated in hm1,if they have same key but different value
        hm2.put("caterpillar", 2);
        hm2.put("lion", 3);
        hm2.put("tiger", 4);
        hm2.put("tiger1", 4);// Added to the system

        //all e
        hm1.putAll(hm2);

        System.out.println(hm1);

    }// void putAll(Map<? extends K, ? extends V> m

    public static void compute() {
        /*
            If value absent , nullPointerException
         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);

        //Lambda expression: (key, value) -> value or key( any kind of expresssion)
        //compute is used to update only "value" no updating key.
        hm1.compute("cat", (key, value) -> value + 5);

        System.out.println(hm1);
    }

    public static void computeIfPresentIfAbsent() {
        /*
        If the value for the specified key is present and non-null,
        attempts to compute a new mapping given the key and its current mapped value.
         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);
        hm1.put("lion", 3);
        hm1.put("tiger", 4);
        hm1.put("cat", 11);
        hm1.put("cat", 15);

        //1 - ComputeIfPresent, if key is absent do nothing.
        hm1.computeIfPresent("cat", (key, value) -> value + 3);
        System.out.println(hm1);
        hm1.computeIfPresent("cat1", (key, value) -> value + 3);
        System.out.println(hm1);

        //2- ComputeIfAbsent

        HashMap<String, Integer> hm2 = new HashMap<>();
        hm2.put("cat", 1);
        hm2.put("caterpillar", 2);


        /*

        If the specified key is not already associated with a value (or is mapped to null),
        attempts to compute its value using the given mapping function and enters it into this map unless null.
        If the mapping function returns null, no mapping is recorded.
        If the mapping function itself throws an (unchecked) exception, the exception is rethrown, and no mapping is recorded.
        The most common usage is to construct a new object serving as an initial mapped value or memoized result, as in:

            map.computeIfAbsent(key, k -> new Value(f(k)));

         */

        System.out.println(hm2);

        hm2.computeIfAbsent("snake", k -> 5);

        System.out.println(hm2);

    }// V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)

    public static void putIfAbsent() {
        /*

         */
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("cat", 1);
        hm1.put("caterpillar", 2);

        hm1.putIfAbsent("cat1",33);
        System.out.println(hm1);

    }

}
