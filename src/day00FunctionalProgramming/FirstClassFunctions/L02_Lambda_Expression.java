package day00FunctionalProgramming.FirstClassFunctions;

import java.util.function.Function;

public class L02_Lambda_Expression {

    public static void main(String[] args) {
        //EXAMPLE 1


        //Integer someArg ->someArg*2+1;
        //ACCEPTED ARGUMENT->RETURN VALUE

        //Function<Integer,Integer> multiply(nameOfFunction)=Integer int ->int*2+1

        //Arguments of Function must match with Lambda arguments.

        Function<String, Integer> getStringLength = (String str) -> {
            String a =str+str;
            return a.length();
        };
        System.out.println(getStringLength.apply("hii"));


        absolute();



    }

    public static void absolute(){

        Function<Integer,Integer> absoluteV= (Integer y)->y>0?y:-y;
        Integer b = absoluteV.apply(-3);
        System.out.println(b);
    }



}
