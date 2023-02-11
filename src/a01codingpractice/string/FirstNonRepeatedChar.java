package a01codingpractice.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        findNonRepeatedChar("Hello");
    }

    public static void findNonRepeatedChar(String str){

        // 1st Way
        for (int i = 0; i <str.length() ; i++) {
            boolean unique =true;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
        //2nd Way
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {

        }
    }
}
