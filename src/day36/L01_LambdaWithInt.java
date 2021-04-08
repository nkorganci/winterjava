package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class L01_LambdaWithInt {

    /*
    1- We learned "structured programming" so far, we will learn "functional programming" now.
    2- Structural programming focuses on "how to do" and " what to do"
    3- In "functional programming" we will focus on  "what to do".
    4- t->t%2!=0 is a method.
    5- map(t->t*t) updates the stream methods.
    6-All list questions can be solved by Lambda.
    7- If you use only Lambda Expression , return type is Optiona<Integer>
    8- If you use more than one parameter return type will not be Optional.
    9- Solve all collection questions with Lambda
     */

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(9);
        list1.add(13);
        list1.add(4);
  

        System.out.println(productOfCubeDistinctOdd(list1));

        System.out.println(maxElements(list1));
    }

    public static Optional<Integer> maxElements(List<Integer> list) {

        /*
        7- Create a method to calculate maximum element in the list.
         */

       return list.stream().reduce((x,y)->x>y?x:y);// If you use just Lambda Expression in reduce() method,return type is Optional<Integer>


    }

    public static Integer maxElements1(List<Integer> list) {

        /*
        8- Create a method to calculate maximum element in the list.
         */

       return list.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?x:y);// If you use just Lambda Expression in reduce() method,return type is Optional<Integer>


    }

    public static Optional<Integer> minEl1(List<Integer> l){
        return l.stream().reduce((x,y)->x<y ? x : y);
    }

    public static Integer minEl2(List<Integer> l){
        return l.stream().reduce(Integer.MAX_VALUE, (x,y)->x<y ? x : y);
    }

    public static void printCubeOfOdd(List<Integer> list) {

        /*
        4- Functional programming : print cube of distinct odd list elements on the console same line..
         */
        list.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t -> System.out.println(t + " "));

    }

    public static void printEvenFunctional(List<Integer> list) {
        /*
        1- Functional programming
        Create a method to print the even list elements on the console in the same line
        with a space between two consecutive elements.
         */
        System.out.println();
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

    }

    public static void printEvensStructural(List<Integer> list) {
        //2- Functional programming
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

    public static void printSquareOfOdd(List<Integer> list) {

        /*
        3- Functional programming
        print square of odd list.
         */
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.println(t + " "));

    }

    public static int productOfCubeDistinctOdd(List<Integer> list) {

        /*
        6- Create a method to calculate the sum of the distinct cube of odd elements.
         */

        int sum = list.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).reduce(1, (x, y) -> x * y);
        return sum;
    }

    public static int sumOfSquares(List<Integer> list) {

        /*
        5- Create a method to calculate the sum of the distinct squares of even elements.
         */

        int sum = list.stream().filter(t -> t % 2 == 0).distinct().map(t -> t * t).reduce(0, (x, y) -> x + y);
        return sum;
    }
}
