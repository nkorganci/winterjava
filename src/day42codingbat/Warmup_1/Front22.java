package day42codingbat.Warmup_1;

public class Front22 {

    /*

    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
    so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"
     */
    public static void main(String[] args) {

    }

    public static String front22(String str) {

        if ((str.length() - 1) < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }

    }
}
