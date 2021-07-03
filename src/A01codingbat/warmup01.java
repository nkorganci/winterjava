package A01codingbat;

public class warmup01 {
    public static void main(String[] args) {

        ex("abc");
    }

    public static boolean ex(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            result=result+str.substring(0,i);
        }
        return result;

}
