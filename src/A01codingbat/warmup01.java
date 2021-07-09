package A01codingbat;

public class warmup01 {
    public static void main(String[] args) {


        System.out.println(ex("a"));

    }

    public static String ex(String a) {
        String result=a.substring(a.length()-2);
        return result+result+result;
    }
}