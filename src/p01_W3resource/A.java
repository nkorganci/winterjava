package p01_W3resource;

import java.util.Scanner;

public class A {


    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));

        int sum = 0;
        int count = 0;
        int newSum = 0;

        do {
            count++;
            System.out.println("Please enter a number: ");
            newSum = sum + input.nextInt();

            if(newSum<100){
                sum = newSum;
            }

        } while (newSum < 100);

        System.out.println("sum is: " + sum + " you entered: " + count + " times number");

    }
}


