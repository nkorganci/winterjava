package day36;

import java.util.stream.IntStream;

public class LambdaForForLoop {
    public static void main(String[] args) {

    }

    //Print all integers from 1 to 100 without using any loop
    //1- Use structural programming
    public static void printOneToHundred(int starting, int ending) {

        System.out.println(starting + " ");
        starting++;
        if (starting < 100) {
            printOneToHundred(starting, ending);
        }
    }

    //2-Functional programming
    public static void printOneToHundred1(int starting, int ending) {

    }

    //Find the multiplication of the integers from 3 to 8
    public static int multiplicationOfOddIntegersThreeToEight(int starting, int ending) {
        return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);
    }

    //Find 9! by using functional programming
    public static int factorialOfNine(int starting, int ending) {

        return 2;
    }

    //Find the multiplication of first 5 odd counting numbers which are greater than 6
    public static int multFirstFiveOdd(int num) {
        return IntStream.iterate(7, t -> t + 2).limit(num).reduce(1, Math::multiplyExact);

    }


}
