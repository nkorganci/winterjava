package day01vairables.day02scanner;

public class IncrementDecrement01 {

    public static void main(String[] args) {
        postPreIncrement();
    }

    public static void postPreIncrement() {
        /*
        1- Java runs from top to down , left to right if there is no assignment
        2 - If there is assignment java runs from right to left.
         */

        //Post increment means increase at the end of the statement
        int x = 12;
        System.out.println(x++); // printed 12, made the value of 13
        System.out.println(x); // print 13
        System.out.println(x = x + 1);

        //pre increment means increase before the name of the variable
        System.out.println(++x); // x = 15

        //post decrement means decrease at the end of the statment
        System.out.println(x--); // 15
    }

    public static void incrementDecrement() {


        int num1 = 5;
        //increase the value of num1 by 3

        //1st way
        num1 = num1 + 3;
        System.out.println("1st way " + num1);

        //2nd way
        num1 += 3;
        System.out.println("2nd way " + num1);

        //3rd way, it increases only by one.
        num1++;
        System.out.println("3rd way " + num1);

        //Multiplication

        num1 = num1 * 3;

        num1 *= 3;

        //Decrese the num1

        num1 = num1 - 1;
        num1 -= 1;

        //Division
        num1 = num1 / 2;
        num1 /= 2;
    }
}
