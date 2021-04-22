package day42codingbat.Warmup_1;

public class SleepIn {

    public static void main(String[] args) {

        System.out.println(sleepIn(true, true));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

    }

    public static boolean sleepIn1(boolean weekday, boolean vacation) {

        if (weekday != true || vacation == true) {
            return true;
        } else {
            return false;
        }

    }

}
