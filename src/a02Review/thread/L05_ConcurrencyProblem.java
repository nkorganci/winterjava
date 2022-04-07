package a02Review.thread;

public class L05_ConcurrencyProblem {
}
class Main extends Thread{
    static int amount=0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println(Main.amount);
        amount++;
        System.out.println(Main.amount);
    }

    public void run(){
        amount++;
    }
}

//Concurrent method name

class B extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        B t1 = new B();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}