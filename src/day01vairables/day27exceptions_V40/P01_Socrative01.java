package day01vairables.day27exceptions_V40;

public class P01_Socrative01 {
}

class Test01 {

    public static void main(String s[]) {

        go();
        go(12);
        go(5 >= 5);
    }

    public static void go() {
        System.out.println("Bad");
    }
    public static void go(double i) {
        System.out.println("Good");
    }
    public static void go(boolean b) {
        if (b) {
            System.out.println("The best");
        } else {
            System.out.println("The worst");
        }
    }
}
