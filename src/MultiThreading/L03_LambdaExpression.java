package MultiThreading;

public class L03_LambdaExpression {
    public static void main(String[] args) {

//        We can replace these instances with Runnable class which has run() method.
//        A obj1 = new A();
//        B obj2 = new B();

        Runnable obj1 = ()-> System.out.println("A");
        Runnable obj2 = ()-> System.out.println("B");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}