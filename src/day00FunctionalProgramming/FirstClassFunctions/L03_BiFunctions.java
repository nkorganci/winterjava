package day00FunctionalProgramming.FirstClassFunctions;

import java.util.function.BiFunction;

public class L03_BiFunctions {

    public static void main(String[] args) {

       //1.Created Function Interface by Java
        BiFunction<Integer,Integer,Integer> add = (x,y)->x+y;
        System.out.println(add.apply(22,33));

        //2.Created by user
        TriFunction<Integer,Integer,Integer,Integer> add1= (x,y,z) -> (x+y+z);
        System.out.println(add1.apply(2,3,4));

        //3.Created by user
        NoArgFunction<String> sayHi=()->"hello";
        System.out.println(sayHi.apply());

    }
}
