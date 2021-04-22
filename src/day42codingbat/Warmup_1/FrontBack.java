package day42codingbat.Warmup_1;

public class FrontBack {

    /*

    Given a string, return a new string where the first and last chars have been exchanged.


    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public static void main(String[] args) {

    }

    public static String frontBack(String str ){

        if(str.length()<=1){
            return str;
        }

        String first = str.substring(str.length()-1);
        String last = str.substring(0,1);
        return first + str.substring(1,str.length()-1) + last;
    }
    public static String frontBack2(String str ){

        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
}
