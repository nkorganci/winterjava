package day36;

import java.util.ArrayList;
import java.util.List;

public class LambdaWidthMethodReferenceInt {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(21);
        l.add(22);
        l.add(23);
        l.add(24);
        l.add(25);
        printSquareOfOdd(l);
    }

    public static void printEvensFunctional(List<Integer> l) {

    }

    public static void printSquareOfOdd(List<Integer> list) {

        /*
        2- Functional programming
        print square of odd list.
         */

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        System.out.println();

        list.stream().filter(Utils::checkToBeOdd).map(Utils::findSquare).forEach(System.out::print);
    }

    public static int sumOfSquares(List<Integer> list) {

        /*
        3- Create a method to calculate the sum of the distinct squares of even elements.
         */

        int sum = list.stream().filter(t -> t % 2 == 0).distinct().map(t -> t * t).reduce(0, (x, y) -> x + y);

        int sum1 = list.stream().filter(Utils::checkToBeEven).distinct().map(Utils::findSquare).reduce(0, Math::addExact);
        return sum;
    }

}
