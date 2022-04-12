package a02Review.collections1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();

        country.put("TR1","Georgia1");
        country.put("TR2","Georgia2");
        country.put("TR3","Georgia3");
        country.put("TR4","Georgia4");

        Set set = country.entrySet();

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }




    }
}
