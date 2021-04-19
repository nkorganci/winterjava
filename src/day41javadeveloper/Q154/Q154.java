package Q154;

import java.util.ArrayList;
import java.util.List;

public class Q154 {//Answer: B

//    . Given:
//List<String> list1 = new ArrayList<>(); list1.add(“A”);
//list1.add(“B”);
//List list2 = List.copyOf(list1); list2.add(“C”);
//List<List<String>> list3 = List.of(list1, list2); System.out.println(list3);


//What is the result?
//A. [[A, B],[A, B]]
//B. An exception is thrown at run time.
// C. [[A, B], [A, B, C]]
//    D. [[A, B, C], [A, B, C]]



    //Explanation:
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        List list2 = List.copyOf(list1);
        list2.add("C");
        List<List<String>> list3 = List.of(list1, list2);
        System.out.println(list3);
    }
}
//UnsupportedOperationException
