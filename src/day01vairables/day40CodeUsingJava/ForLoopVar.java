package day01vairables.day40CodeUsingJava;

public class ForLoopVar {
}

class Test22 {
    public static void main(String[] args) {
        var var = 0; //Line l1
        var: for (; var < 6; var++) { //Line l2
            if (var % 3 == 0) {
                continue var; //Line l3
            }
            var++; //Line l4
        }
        System.out.println(var);
    }
}