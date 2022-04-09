package a02Review;
// 1 How to create a static block?
public class L17_StaticBlock {
    static int b;
    public static void show(){
        System.out.println("static method");
    }
    static {
        b=7;
        show();
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}

// 2 How do the multiple static blocks?

class Mainclass{
    static int b;
    public static void show(){
        System.out.println("Static method ");
    }
    static {
        b=5;
        System.out.println("value of b " + b);
    }
    static {
        b=10;
        System.out.println("value of b " + b);
    }

    public static void main(String[] args) {
        System.out.println("Main method");

        Mainclass obj = new Mainclass();
        System.out.println(Mainclass.b);
    }
}

// static and non -static block
class staticBlock{
    int a;
    static int b;

    static {
        System.out.println("b static " + b);
        b=3;
        System.out.println("b static " + b);
    }
    {
        a=33;
        System.out.println("a non static " + a);
    }

    public static void main(String[] args) {
        System.out.println("Main method ");
        staticBlock obj = new staticBlock();

    }
}