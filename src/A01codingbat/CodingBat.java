package A01codingbat;

import java.util.Arrays;
import java.util.Locale;

public class CodingBat {

    public boolean xyzThere(String str) {

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='b'&&str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;

}



