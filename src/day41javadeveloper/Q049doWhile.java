package day41javadeveloper;

public class Q049doWhile {
}

class Question {
    public static void main(String[] args) {
        int x = 0;
        do {

            x++;

            if (x == 1) {

                continue;
            }
            System.out.println(x);
        } while (x < 1);
    }
}

/*
What is the result?
A. 01
B. 0
C. 1
D. The program prints nothing. E. It prints 1 in the infinite loop.

Answer: D
 */
