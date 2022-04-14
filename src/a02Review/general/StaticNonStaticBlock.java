package a02Review.general;

public class StaticNonStaticBlock {
    int a=2;
    static int b = 4;
    int c;

    {
        a=22;
        b=55;
    }
    static {
        b=33;

    }

    public void test(){
        System.out.println(b +" " +a +" " + c);
    }

    public static void main(String[] args) {
        StaticNonStaticBlock obj = new StaticNonStaticBlock();
        obj.test();
    }
}
