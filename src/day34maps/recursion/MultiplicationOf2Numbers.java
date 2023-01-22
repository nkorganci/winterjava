package day34maps.recursion;

public class MultiplicationOf2Numbers {
    public static void main(String[] args) {
        System.out.println(multiplyNum(4,9));

    }

    public static int multiplyNum(int a, int b){
        if(b==0)
            return 0;
        if (b==1)
            return a;

        return a+multiplyNum(a,b-1);
    }
}
