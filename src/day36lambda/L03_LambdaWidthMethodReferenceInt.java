package day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class L03_LambdaWidthMethodReferenceInt {

    /*
    1- Method reference ==> Class Name:: Method Name
    2- You can use your own method or java created method.
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);

        System.out.println(maxElements(l));
    }

    public static void cubeOfOdd(List<Integer> list) {

        // 4- Functional programming : print cube of distinct odd list elements on the console same line..

        list.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t -> System.out.println(t + " "));
        System.out.println();
        list.stream().filter(Utils::checkToBeOdd).distinct().map(Utils::findCupe).forEach(System.out::println);

    }

    public static List<Integer> getNegativesFunctional(int arr[][]) {

        List<Integer> negElList = new ArrayList<>();

        Arrays.stream(arr).flatMapToInt(t -> Arrays.stream(t)).filter(t -> t < 0).forEach(t -> negElList.add(t));

        return negElList;

    }//???? Lambda with methods

    public static List<Integer> getNegativesStructured(int arr[][]) {

        /*
        int arr[][] = { {-4, -3, -2, -1, 0 ,1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4} };
        Create a method to store all negative elements in a list then print the list on the console.
        */

        List<Integer> negElList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                if (arr[i][k] < 0) {
                    negElList.add(arr[i][k]);
                } else {
                    break;
                }

            }
        }
        return negElList;

    }

    public static Integer maxElements(List<Integer> list) {

        /*
        7- Create a method to calculate maximum element in the list.
         */
        int a = list.stream().reduce(Integer.MIN_VALUE, Math::max);

        return a; //list.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);// If you use just Lambda Expression in reduce() method,return type is Optional<Integer>

    }

    public static Optional<Integer> maxElements1(List<Integer> list) {

        /*
        8- Create a method to calculate maximum element in the list.
         */

       // Optional<Integer> maxEl = list.stream().reduce((x, y) -> Math::max); // ?? did not work why

        Optional<Integer> maxEl1 = list.stream().reduce((x, y) -> x > y ? x : y);

        // If you use just Lambda Expression in reduce() method,return type is Optional<Integer>

        return maxEl1;
    }

    public static Optional<Integer> minEl1(List<Integer> l) {
        return l.stream().reduce((x, y) -> x < y ? x : y);
    }

    public static Integer minEl2(List<Integer> l) {

        int b = l.stream().reduce(Integer.MAX_VALUE, Math::min);

        return l.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);

    }

    public static void printEvensFunctional(List<Integer> l) {

        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println(t + " "));
        l.stream().filter(Utils::checkToBeEven).forEach(System.out::print); // This is identical with previous one.
    }

    public static void printSquareOfOdd(List<Integer> list) {

        /*
        2- Functional programming print square of odd list.

         */

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        System.out.println();

        list.stream().filter(Utils::checkToBeOdd).map(Utils::findSquare).forEach(System.out::print);
    }

    public static int prdtOfCubeDistinctOdd(List<Integer> list) {

        /*
        6- Create a method to calculate the prod of the distinct cube of odd elements.
         */

        int sum = list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).reduce(1, (x, y) -> x * y);
        int sum1 = list.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::findCupe).reduce(1, Math::multiplyExact);

        return sum;
    }

    public static void squareOfOdd(List<Integer> list) {

        /*
        3- Functional programming print square of odd list
        */
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.println(t + " "));

        System.out.println();

        list.stream().filter(Utils::checkToBeOdd).map(Utils::findSquare).forEach(System.out::println);

    }

    public static int sumOfSquares(List<Integer> list) {

        /*
        3- Create a method to calculate the sum of the distinct squares of even elements.
         */

        int sum = list.stream().filter(t -> t % 2 == 0).distinct().map(t -> t * t).reduce(0, (x, y) -> x + y);
        int sum1 = list.stream().filter(Utils::checkToBeEven).distinct().map(Utils::findSquare).reduce(0, Math::addExact);
        return sum1;

    }//int addExact(int x, int y), Returns the sum of its arguments, throwing an exception if the result overflows an int.

}
