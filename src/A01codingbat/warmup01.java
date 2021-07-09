package A01codingbat;

public class warmup01 {
    public static void main(String[] args) {


        System.out.println(ex("1234"));

    }

    public static boolean ex(String str, int n) {

        if (str.length() < 3) {
            return false;
        } else if (str.length() > 3 && (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"))){
            return true;
        }else {
            return false;

        }


    }

