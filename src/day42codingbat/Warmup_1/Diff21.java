package day42codingbat.Warmup_1;

public class Diff21 {
    /*
        Given an int n, return the absolute difference between n and 21,
        except return double the absolute difference if n is over 21
     */
    public static void main(String[] args) {

    }

    public static int diff21(int n){

        if(n>21){
            return 2*(n-21);
        }
        return 21-n;

    }
}
