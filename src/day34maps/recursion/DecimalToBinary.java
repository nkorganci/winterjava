package day34maps.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {

        System.out.println(dB(33));
    }

    public static int dB(int num) {

        if (num == 0) {
            return 0;
        }
        return num % 2 + 10*dB(num / 2);
    }
}
