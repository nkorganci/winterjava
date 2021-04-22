package day42codingbat.Warmup_1;

public class IcyHot {

    /*

    Given two temperatures, return true if one is less than 0 and the other is greater than 100.


    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false

     */
    public static void main(String[] args) {

    }

    public static boolean icyHot(int a, int b ){

        return a<0&&b>100 || a>100&&b<0;

    }
}
