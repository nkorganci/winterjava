package a01codingpractice;

public class TrueFalse {
    public static void main(String[] args) {
        foo(false,false);

    }
    public static void foo(boolean a,boolean b){
        if(a){
            System.out.println("A");
        }else if(a&&b){
            System.out.println("A&&B");
        }else {
            if(!b){
                System.out.println("notB");
            }else {
                System.out.println("ELSE");
            }
        }
    }
}
