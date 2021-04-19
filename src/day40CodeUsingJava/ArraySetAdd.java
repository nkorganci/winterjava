package day40CodeUsingJava;

import java.util.ArrayList;
import java.util.List;

public class ArraySetAdd {
}

class Test1 {
    public static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add(0, "certification");
        testList.set(0, "guide");
        System.out.println(testList);
    }
}