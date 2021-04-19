package Q122;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Hello {
    public static void main(String[] args) {
 //Line1
        //    List<String>fruits=new ArrayList<>(List.of("apple","orange","banana"));
        //   fruits.replaceAll(function);


       UnaryOperator<String> function =String::toUpperCase;
      List<String>fruits=new ArrayList<>(List.of("apple","orange","banana"));
       fruits.replaceAll(function);

    }
}

/*
Which statement on line 1 enables this code fragment to compile?
A. Function function = String::toUpperCase;
B. UnaryOperator function = s −> s.toUpperCase();
C. UnaryOperator<String> function = String::toUpperCase;
D. Function<String> function = m −> m.toUpperCase();

 */