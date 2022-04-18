package a02Review.stringc;

public class SwapNumbers {
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        int x = 4;
        int y =7;
        System.out.println(x+ " " + y);

        swap(x,y);

        System.out.println(x+ " "+ y);
    }
}
