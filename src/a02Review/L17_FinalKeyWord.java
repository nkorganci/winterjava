package a02Review;

public class L17_FinalKeyWord {
}
class AA{
final int speed = 90;
void run(){
    //speed=99;// final variable can not be assigned again.
    System.out.println(speed);
}
 final void run11(){
    System.out.println("final method");
}
}


// Initialize final
class CC1{
    final int num;
    final static int numStatic;
    CC1(){
        num=22;
        System.out.println("num "+ num);
    }

    static {
        numStatic=99;
        System.out.println("numStatic " + numStatic);
    }

    void cal(final int a){

        System.out.println(a*a);
    }
    public static void main(String[] args) {
        new CC1().cal(3);
        new CC1().cal(4);
    }
}

// What is final parameter?

