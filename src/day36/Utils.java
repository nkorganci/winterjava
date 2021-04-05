package day36;

public class Utils {
    public static boolean checkToBeOdd(int a){
        return a%2!=0;
    }
    public static boolean checkToBeEven(int a){
        return a%2==0;
    }
    public static int findSquare(int a){
        return a*a;
    }
    public static boolean startWithA(String s) {
        return s.startsWith("A");
    }
}
