package day42codingbat.Warmup_1;

public class sumDouble {
    public static void main(String[] args) {

    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public static int sumDouble1(int a, int b) {

        int sum = a + b;
        if (a == b) {
            return sum *= 2;
        }
        return sum;
    }
}
