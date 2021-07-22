package A01codingbat;

import java.util.Arrays;
import java.util.Locale;

public class CodingBat {

    public static void main(String[] args) {


    }
    public String mixString(String a, String b) {

        int min=Math.min(a.length(),b.length());

        int x=0;
        String total="";

        while (x<min){
            String aSub=a.substring(x,x+1);
            String bSub=b.substring(x,x+1);
            total+=aSub+bSub;
            x++;
        }
        return total+a.substring(x) + b.substring(x);
    }


    }



