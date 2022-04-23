package a04geeksforgeeks;

public class Exam{
}
class One implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
class Two implements Runnable{
    public void run(){
        new One().run();
    }
}
class Three{
    public static void main(String[] args) {
        new Thread(new One(),"hi").start();
    }
}
