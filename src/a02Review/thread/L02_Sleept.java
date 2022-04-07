package a02Review.thread;

public class L02_Sleept {
}

class TestSleepMethod1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {


            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(i);
            }
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();

        t1.start();
        t2.start();
    }
}
// Example of the sleep() Method in Java : on the main thread

class TestSleep{
    public static void main(String[] args) {
        try {
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

// Can we start a thread twice

class RunTwice extends Thread{
    public void run(){
        System.out.println("Thread id running");
    }

    public static void main(String[] args) {
        RunTwice a = new RunTwice();
        a.run();
        a.start();
        a.start();
    }
}