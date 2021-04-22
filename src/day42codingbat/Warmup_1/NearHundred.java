package day42codingbat.Warmup_1;

public class NearHundred {
    /*

Given an int n, return true if it is within 10 of 100 or 200.
Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
     */
    public static void main(String[] args) {
        System.out.println(NearHundred(95));

    }

    public static boolean NearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }
}
