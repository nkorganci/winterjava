package a02Review.thread;

public class L04_ThreadStart {
}
class A extends Thread{
    public void run(){
        System.out.println("This thread in thread");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        System.out.println("outside of the thread");
    }
}