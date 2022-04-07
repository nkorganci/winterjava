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
