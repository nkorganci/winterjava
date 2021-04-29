package day00FunctionalProgramming.FirstClassFunctions;

import java.util.function.Function;

public class L06_Returning_Functions {

    protected static class MyMath{
        public static Integer timesTwo(Integer x){
            return x*2;
        }

        public static Integer timesThree(Integer x){
            return x*3;
        }
        public static Integer timesFour(Integer x){
            return x*4;
        }

        public static Function<Integer,Integer> multiplier(Integer y){
            return (Integer x)->x*y;
        }

    }


    public static void main(String[] args) {

        //1st Way
        NoArgFunction<NoArgFunction<String>>createPrinter=()->{
            return ()->"Hello functional";
        };

        //2nd Way
        NoArgFunction<NoArgFunction<String>>createPrinter1=()-> ()->"Hello functional";

        NoArgFunction<String> greeter = createPrinter.apply();


        //No need to write method for each multiplication
        Function<Integer,Integer> timesTwo=MyMath.multiplier(2);
        Function<Integer,Integer> timesThree=MyMath.multiplier(3);

        System.out.println(timesTwo.apply(6));
        System.out.println(timesThree.apply(6));

    }
}
