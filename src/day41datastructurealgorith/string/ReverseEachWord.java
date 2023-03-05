package day41datastructurealgorith.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        reverseWord("d");
    }

    //1st Way: reverse
    public static void reverseWord(String str){

        if(str.length()<=1){
            System.out.println(str);
        }


        String[] strArray= str.split(" ");
        String resul="";
        for(String stringWord: strArray){
            String w ="";
            for (int i = stringWord.length()-1; i >=0 ; i--) {
                w +=stringWord.charAt(i);
            }
            resul +=w+" ";

        }
        System.out.println(resul);
    }

    // 2nd Way StringBuilder
    public static String reverse (String text){

        String [] stringWords = text.split(" ");
        String reverseWord = "";
        for (String w: stringWords){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord +=sb +" ";
        }

        return reverseWord;
    }

    public static String reverseLambda(String text){
       return  Arrays.asList(text.split(" ")).stream().map(s->new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
    }
}
