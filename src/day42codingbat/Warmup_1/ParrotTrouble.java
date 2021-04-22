package day42codingbat.Warmup_1;

public class ParrotTrouble {
    /*

        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        Return true if we are in trouble.
     */
    public static void main(String[] args) {

    }

    public static boolean parrotTrouble(boolean talking, int a){

        return talking && (a<7|| a>20);


    }
}
