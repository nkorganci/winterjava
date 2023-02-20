package MultiThreading;

public class L01_ThreadCreation {
    public static void main(String[] args) throws InterruptedException {

        Hello obj1 = new Hello();
        Hi obj2 = new Hi();
        obj1.start();
        Thread.sleep(20);// If we add this there will not be thread collision
        obj2.start();
    }
}

class Hello extends Thread{
    public void run()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hi extends Thread{
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
