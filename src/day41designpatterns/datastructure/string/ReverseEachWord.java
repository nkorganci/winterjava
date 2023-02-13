package day41designpatterns.datastructure.string;

public class ReverseEachWord {
    public static void main(String[] args) {
        reverseWord("d");
    }

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
}
