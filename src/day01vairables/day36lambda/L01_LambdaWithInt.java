package day01vairables.day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class L01_LambdaWithInt {

    /*
    1- We learned "structured programming" so far, we will learn "functional programming" now.
    2- Structural programming focuses on "how to do" and " what to do"
    3- In "functional programming" we will focus on  "what to do".
    6-All list questions can be solved by Lambda.
    7- If you use only Lambda Expression , return type is Optiona<Integer>
    8- If you use more than one parameter return type will not be Optional.
    13- reduce(initial value, ( x, y) -> x+y)  return integer so you need to assign it to int.
        x gets initial value, y gets value from the stream
        x gets the value from x+y, y gets the value from the stream again.
    14- If you use just Lambda Expression in reduce() method, return type will be Optional<Integer>--> reduce((x, y) -> x < y ? x : y);
        Otherwise it will be regular return type. --> reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);

     */

    public static void main(String[] args) {

        int arr[][] = {{-4, -3, -2, -1, 0, 1, 2}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 0, 1, 2, 3, 4}};

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(productOfCubeDistinctOdd(list1));
        maxElements(list1);

    }

    public static void maxElements(List<Integer> list) {

        /* QUESTIONS: Create a method to calculate maximum element in the list. */
        //1st Way Reduce
        int max1= list.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
        //2nd Way
        int max2 = list.stream().min(Integer::compareTo).get();




    }

    public static Optional<Integer> maxElements1(List<Integer> list) {

        /*
        8- Create a method to calculate maximum element in the list.
         */

        Optional<Integer> maxEl = list.stream().reduce((x, y) -> x > y ? x : y);
        // If you use just Lambda Expression in reduce() method,return type is Optional<Integer>

        return maxEl;
    }

    public static Optional<Integer> minEl1(List<Integer> l) {
        return l.stream().reduce((x, y) -> x < y ? x : y);
    }

    public static Integer minEl2(List<Integer> l) {
        return l.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
    }

    public static void CubeOfOdd(List<Integer> list) {

        /*
        4- Functional programming : print cube of distinct odd list elements on the console same line..
         */
        list.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t -> System.out.println(t + " "));

    }

    public static void EvenFunctional(List<Integer> list) {
        /*
        1- Functional programming Create a method to print the even list elements on the console in the same line
            with a space between two consecutive elements.
         */

        /*
        1-Stream put the elements top to down
        2-With STREAM we can use more methods.
        3-Functional programming just learn WHEN to use METHODS.
         */
        System.out.println();
        list.stream().filter(t -> t % 2 == 0).forEach((t -> System.out.print(t + " ")));

    }

    public static void EvensStructural(List<Integer> list) {
         /*
        Create a method to print the even list elements on the console in the same line
        with a space between two consecutive elements.
         */

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }


    }

    public static void squareOfOdd(List<Integer> list) {

        /*
        3- Functional programming print square of odd list
         */

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.println(t + " "));
    }

    public static int productOfCubeDistinctOdd(List<Integer> list) {

        /*
        6- Create a method to calculate the sum of the distinct cube of odd elements.
         */

        int sum = list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).reduce(1, (x, y) -> x * y);
        return sum;
    }

    public static int sumOfSquares(List<Integer> list) {

        /*
        5- Create a method to calculate the sum of the distinct squares of even elements.
         */

        int sum = list.stream().filter(t -> t % 2 == 0).distinct().map(t -> t * t).reduce(0, (x, y) -> x + y);
        return sum;
    }

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

    public static List<Integer> getNegativesFunctional(int arr[][]) {

        List<Integer> negElList = new ArrayList<>();

        Arrays.stream(arr).flatMapToInt(t -> Arrays.stream(t)).filter(t -> t < 0).forEach(t -> negElList.add(t));

        return negElList;

    }

}
