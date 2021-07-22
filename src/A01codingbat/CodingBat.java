package A01codingbat;

import java.util.Arrays;
import java.util.Locale;

public class CodingBat {

    public static void main(String[] args) {


    }
    public String getSandwich(String str) {


        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i)=='*'&&str.charAt(i-1)==str.charAt(i+1)){
                return true;
            }
        }
        return false;




}



