package a01codingpractice;

public class ValueOfKAfterFunctionRun {
    static void doIt(int x,int y,int m){
        if(x==5){
            m=y;
        }else {
            m=x;
        }
    }
    public static void main(String[] args) {
        int i = 5,j=55,k=9;
        ValueOfKAfterFunctionRun.doIt(i,j,k);
        System.out.println(k);
    }
}
