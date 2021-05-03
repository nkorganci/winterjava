package day00FunctionalProgramming.P01_FirstClassFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class L02_Lambda_Expression {
            /*
        1-A Java lambda expression is thus a function which can be created without belonging to any class.
        2-A Java lambda expression can be passed around as if it was an object
        3-Function<Integer,Integer> multiply(nameOfFunction)=Integer int ->int*2+1


        () -> System.out.println("Zero parameter lambda");
        (param) -> System.out.println("One parameter: " + param);// Only when the method takes a single parameter can the parentheses be omitted.
        (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);
        (Car car) -> System.out.println("The car is: " + car.getName());
        Function<String, String> toLowerCase = (var input) -> input.toLowerCase();//var Parameter Types from Java 11

        -->Returning a Value From a Lambda Expression
           (param) -> {
           System.out.println("param: " + param);
           return "return value";
           }

    In case all your lambda expression is doing is to calculate a return value and return it
        (a1, a2) -> { return a1 > a2; }
        (a1, a2) -> a1 > a2;

         */

    public static void main(String[] args) {

lambdaParameters();
    }

    public static void absolute() {

        Function<Integer, Integer> absoluteV = (Integer y) -> y > 0 ? y : -y;
        Integer b = absoluteV.apply(-3);
        System.out.println(b);
    }

    public static void lambdaParameters() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

//        numbers.forEach( (n) -> { System.out.println(n); } );
//        numbers.forEach( System.out::println );

        Consumer<Integer> method=System.out::println;//Consumer is an interface.
        numbers.forEach(method);



    }
    interface StringFunction {
        String run(String str);
    }



}





