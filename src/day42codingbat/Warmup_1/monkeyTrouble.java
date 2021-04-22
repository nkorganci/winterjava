package day42codingbat.Warmup_1;

public class monkeyTrouble {

        /*
        NOTE:
        !(A && B) equals !A || !B, so
        !(A && B) and !A && !B are not the same thing
         */
    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble1(true, false));
        System.out.println(monkeyTrouble2(true, false));
        System.out.println(monkeyTrouble3(true, false));

    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    public static boolean monkeyTrouble1(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!(aSmile && bSmile)) {
            return true;
        }
        return false;
    }
    public static boolean monkeyTrouble3(boolean aSmile, boolean bSmile) {

        return aSmile==bSmile;
    }
}
