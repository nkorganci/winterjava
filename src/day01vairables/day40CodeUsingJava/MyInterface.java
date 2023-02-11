package day01vairables.day40CodeUsingJava;
/*
Explanation -
The return statement works as calculate() method of MyInterface returns void

int i is declared within the body of lambda expression.
i is declared and initialized to 10, i is incremented by 1 and becomes 11.
 */

public interface MyInterface {
    void calculate();
}

class First {
    public static void main(String[] args) {
        MyInterface obj = () -> {
            int i = 22;
            i++;
            System.out.println(i);
            return;
        };
        obj.calculate();
    }
}
