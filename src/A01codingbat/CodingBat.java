package A01codingbat;

public class CodingBat {
    public static void main(String[] args) {

        int[] a = {1, 2, 6};
        System.out.println(coding(a));

    }

    public static boolean coding(int n,boolean w) {

        if(w&&n>=40){
            return true;
        }
        return n<=60&&n>=40;

        return w? n>=40:n<=60&&n>=40;

}

