package day34maps.recursion;

public class FactorialNumber {
    public static void main(String[] args) {

//        System.out.println(a(9));
        limited(5);
    }

    public static int a(int n){

        if(n==1){
            return 1;
        }else {
            return n*a(n-1);
        }
    }

    public static void limited(int num){


        if(num<=1){
            return ;
        }
        System.out.println("hi");

        limited(num-1);


    }
}
