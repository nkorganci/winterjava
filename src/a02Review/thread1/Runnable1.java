package a02Review.thread1;

public class Runnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("hi");
    }
}

class Test{
    public static void main(String[] args) {
        Runnable1 r = new Runnable1();
        Thread obj = new Thread(r);
        Thread obj1 = new Thread(r);
        obj.start();
        obj1.start();
    }
}
