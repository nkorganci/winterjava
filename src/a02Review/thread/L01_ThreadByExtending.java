package a02Review.thread;

public class L01_ThreadByExtending {
}
// 1) Java Thread Example by extending Thread class
class Multi extends Thread{
   public void run(){
        System.out.println("Hi thread");
    }

    public static void main(String[] args) {
       Multi t1 = new Multi();
       t1.run();
    }
}

//2) Java Thread Example by implementing Runnable interface
class Multi1 implements Runnable{
    public void run(){
        System.out.println("Hi runnable...");
    }

    public static void main(String[] args) {
        Multi1 t2 = new Multi1();
        Thread obj = new Thread(t2);
        obj.run();
    }
}

// 3) Using the Thread Class: Thread(String Name)
class MyThread1{
    public static void main(String[] args) {
        Thread t = new Thread("My first Thread");
        t.start();

        String str = t.getName();
        System.out.println(str);
    }

}

// 4) Using the Thread Class: Thread(Runnable r, String name)
class MyThread2 implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Runnable r1 = new MyThread2();
        Thread th1 = new Thread(r1,"My New Thread");
        th1.start();// moves the thread to active state
        String str = th1.getName();
        System.out.println(str);
    }
}