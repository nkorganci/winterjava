package day01vairables.day34maps.recursion;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(gcd(44, 20));
    }

    public static int gcd(int a, int b) {

        if (a < 0 || b < 0)
            if (b == 0)
                return a;
        return gcd(b, a % b);
    }

}
