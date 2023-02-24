package day01vairables.day37functionalinterface;

import java.util.function.Predicate;

public class BiConsumer {
    static void ShowDetails(String name, Integer age) {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        //Referring Method
        java.util.function.BiConsumer<String, Integer> biCon = BiConsumer::ShowDetails;
        biCon.accept("a", 2);
        biCon.accept("a", 2);

        //Using lambda expression
        java.util.function.BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);

        Predicate<Integer> predicate = (a)-> a>2;
        predicate.test(3);

    }
}
