package A01codingbat;

public class warmup01 {
    public static void main(String[] args) {

        ex("abcxx");
    }

    public static boolean ex(String str) {

        String result="";
        for(int i=0; i<str.length(); i=i+2){
            result=result+str.charAt(i);
        }
        return result;

}
