package Test;

public class Test1 {
    public static void main(String[] args) {
// 1 1 2 3 5
        System.out.println(fibonacci(5));

    }

    public static int  fibonacci(int n){
        // 1 1 2

        if(n<=1){
            return 1;
        }



        return  fibonacci(n-1) + (n-2);


    }
}
