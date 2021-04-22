package day42codingbat.Warmup_1;

public class MixStart {

    /*

    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
     */
    public static void main(String[] args) {

    }

    public static boolean mixStart(String str){

        if(str.length()<=2){
            return false;
        }
        return  (str.substring(1,3).equals("ix"));

    }
}
