package a02Review.thread;

public class L06_ThreadName {
}

class Naming extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Naming t1 = new Naming();
        Naming t2 = new Naming();
        System.out.println("Name of thread1 " + t1.getName());
        System.out.println("Name of thread2 " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("Thread 1 has changed");
        System.out.println("After thread 1 " + t1.getName());
    }
}

// Example of naming a thread : Without Using setName() Method

class ThreadName extends Thread{
    ThreadName(String threadName){
        super(threadName);
    }
    public void run(){
        System.out.println("The thread is executing...");
    }
}

class ThreadNameExample{
    public static void main(String[] args) {
        ThreadName th2 = new ThreadName("T2");
        ThreadName th1 = new ThreadName("T1");

        System.out.println("Thread-1 " + th1.getName());
        System.out.println("Thread-2 " + th2.getName());
        th1.start();
        th2.start();
    }
}
