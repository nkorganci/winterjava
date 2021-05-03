package day00FunctionalProgramming.P01_FirstClassFunctions;

import java.util.function.Function;

public class L01_Function_Interface {

    /*
    1- First-class functions are functions that can be treated like any other value.
    You can pass them to functions as arguments, return them from functions, and save them in variables.

     */

    /*
        Declarative: Lambda->Functional Programming
        Immutability: All data are immutable are final, final x=4; you can not change, x=3 means x is 3 which is constant.
        1-Functions can be assigned to variables.

        Represents a function that accepts one argument and produces a result.
        This is a functional interface whose functional method is apply(Object).

        Type parameters:
        <T> – the type of the input to the function
        <R> – the type of the result of the function
     */

    protected static class MyMath{
        public static Integer triple(Integer x){
            return x*3;
        }
    }

    static Integer sample(String str){
        return str.length();
    }

    public static void main(String[] args) {

        Function<Integer,Integer>myTriple=MyMath::triple;

        int result= myTriple.apply(3);

        Function<String,Integer>length=L01_Function_Interface::sample;
        Integer len=length.apply("hi");
        System.out.println(len);

    }




}
