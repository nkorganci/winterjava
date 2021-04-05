package p01_W3resource;

import java.util.Scanner;

public class Q32_CompareTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Write second number: ");
        int secondNumber = scan.nextInt();

        if(firstNumber==secondNumber){
            System.out.println( firstNumber + "==" + secondNumber);
        }

        if (firstNumber == secondNumber) {
            System.out.printf("%d==%d", firstNumber, secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.printf("%d < %d", firstNumber, secondNumber);
        }

    }
}
