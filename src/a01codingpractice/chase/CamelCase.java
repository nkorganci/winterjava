package a01codingpractice.chase;

public class CamelCase {

    public static void main(String[] args) {

        String s = "Hi";
       char[] ch= s.toCharArray();
        System.out.println(ch);

        //Print Char array
        for(char a:ch){
            System.out.println(a);
        }

        //Lambda expression
        System.out.println(s.chars().filter(c->Character.isUpperCase((char)c)).count()+1);


    }

    public static int CamelCase1(String s){
               int i=1;
        for(char k:s.toCharArray()){
            if(Character.isUpperCase(k)){
                i++;
            }
        }
        return i;
    }

//    public static int CamelCase2(String s){
//
//    }
}
