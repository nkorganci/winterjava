package A01codingbat;

public class CodingBat {
    public static void main(String[] args) {

        int[] a = {1, 2, 6};
        System.out.println(coding(a));

    }

    public static boolean coding(int n, boolean w) {


    }

    public int redTicket(int a, int b, int c) {

        if(a==2&&b==2&&c==2){
            return 10;
        }else if(a==b&&b==c){
            return 5;
        }else if(b!=a&&c!=a){
            return 1;
        }else {
            return 0;
        }
    }



    }

