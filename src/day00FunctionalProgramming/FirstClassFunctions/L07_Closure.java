package day00FunctionalProgramming.FirstClassFunctions;

public class L07_Closure {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> a =()->{

            String name="Adam";
            return ()->"Hello" + name;
        };

        NoArgFunction<String> b= a.apply();
        System.out.println(b.apply());


    }

}
