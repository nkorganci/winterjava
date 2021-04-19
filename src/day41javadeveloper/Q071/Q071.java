//package day41javadeveloper.Q071;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Q071 {
//    public class main {
//        static Map<String, String> map = new HashMap<>();
//        static List<String> keys =
//                new ArrayList<>(List.of("A", "B", "C", "D"));
//        static String[] values =
//                {"one", "two", "three", "four"};
//
//        static {
//            for (var i = 0; i < keys.size(); i++) {
//                map.put(keys.get(i), values[i]);
//            }
//        }
//
//        public static void main(String[] args) {
//            keys.clear();
//            values = new String[0];
//            System.out.println("Map: " + map.size() + " Keys: " + keys.size() + " Values: " + values.length);
//
//        }
//    }
//}
//
//
///*
//        What is the result?
//        A. Map: 0 Keys: 0 Values: 0
//        B. The compilation fails.
//        C. Map: 4 Keys: 4 Values: 4
//        D. Map: 4 Keys: 0 Values: 0 (Answer D)
//        E. Map: 0 Keys: 4 Values: 4
// */