package a02Review.general;

public class First {
    public void myMethod(){
        System.out.println("Method");
    }
    {
        System.out.println("Instance Block");
    }
    public First(){
        System.out.println("Constructor");
    }
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {

        First obj = new First();
        obj.myMethod();
    }
}
