package day36lambda;

import java.util.stream.IntStream;

public class L07_LambdaForForLoop {
    /*
    1-IntStream and range is used for "for loop"
        a- A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations.
        b- This is the int primitive specialization of Stream.

    2- If you have stream, you can use filter.

    3- Range, rangeClosed, Iterate->IntStream

     */

    public static void main(String[] args) {
        sumOfEvenIntegers(1, 5);

    }

    //Print all integers from 1 to 100 without using any loop- 1- Use structural programming
    public static void printOneToHundred(int starting, int ending) {

        System.out.println(starting + " ");
        starting++;

        if (starting < 101) {
            printOneToHundred(starting, ending);
        }
    }

    //Print all integers from 1 to 100 without using any loop-  2-Functional programming
    public static void printOneToHundred1(int starting, int ending) {

        IntStream.range(starting, ending + 1).forEach(t -> System.out.println(t + " "));

        IntStream.rangeClosed(starting, ending).forEach(t -> System.out.println(t + " "));//1st and 2nd parameter are inclusive.

    }// IntStream range(int startInclusive, int endExclusive), Returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.

    //Find the sum of the integers from 3 to 98 by using functional programming
    public static void sumOfIntegers(int starting, int ending) {

        //1st Way
        int sum = IntStream.rangeClosed(starting, ending).sum();
        System.out.println(sum);

        //2nd Way
        int sum1 = IntStream.rangeClosed(starting, ending).reduce(0, (x, y) -> x + y);
        System.out.println(sum1);

    }

    //Find the sum of the even integers from 3 to 98 by using functional programming
    public static void sumOfEvenIntegers(int starting, int ending) {

        //1st Way
        int sum = IntStream.rangeClosed(starting, ending).filter(t -> t % 2 == 0).sum();
        System.out.println(sum);

        //2nd Way
        int sum1 = IntStream.rangeClosed(starting, ending).filter(t -> t % 2 == 0).reduce(0, (x, y) -> (x + y));
        System.out.println(sum1);

        //3rd Way
        int sum2 =0;
       // int sum3 = IntStream.rangeClosed(starting, ending).filter(t -> t % 2 == 0).forEach(t->sum2+=t);

    }

    //Find the multiplication of the integers from 3 to 8
    public static int multiplicationOfOddIntegersThreeToEight(int starting, int ending) {
        return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);

   }

    //Find 9! by using functional programming
    public static int factorialOfNine(int num) {

        return IntStream.rangeClosed(1,num).reduce(1,Math::multiplyExact);
    }//int multiplyExact(int x, int y), Returns the product of the arguments, throwing an exception if the result overflows an int.

    //Find the multiplication of first 7 even counting numbers ( 2, 4, 6,, 14)
    public static void multiplicationOfFirstSevenEven(int num){
       //1st Way Not recommended
        int sum = IntStream.rangeClosed(1, 2*num).filter(t->t%2==0).reduce(1,Math::multiplyExact);

        //2nd Way
        int sum1 = IntStream.iterate(2,t->t+2).limit(num).reduce(1,Math::multiplyExact);

    }

    //Find the sum of the first 23 odd counting numbers
    public static void addOddNumbersFirst23(int num){

        int sum = IntStream.iterate(1,t->t+2).limit(num).sum();

        }// IntStream limit(long maxSize), Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.

    //Find the multiplication of first 5 odd counting numbers which are greater than 6
    public static int multFirstFiveOdd(int num) {
        return IntStream.iterate(7, t -> t + 2).limit(num).reduce(1, Math::multiplyExact);

    }


}
