package a01codingpractice.string;

public class ReverseString {

    public static void main(String[] args) {

        r("Hello");

    }

    public static void r(String s){
        //1st Way charAt()
        String reversedS = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            reversedS +=s.charAt(i);
        }
        System.out.println("1: " + reversedS);

        //2nd Way toCharArray
        char [] chars = s.toCharArray();
        String reversedS1 = "";
        for (int i = chars.length-1; i >=0 ; i--) {
            reversedS1 +=chars[i];
        }
        System.out.println(reversedS1);

        //3rd Way StringBuilder
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);

        //4th StringBuffer
        StringBuffer sbuffer = new StringBuffer(s);
        System.out.println(sbuffer.reverse());
    }

}
