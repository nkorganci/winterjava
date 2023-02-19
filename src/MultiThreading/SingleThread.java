package MultiThreading;

import javax.sql.rowset.serial.SQLInputImpl;

public class SingleThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        SingleThread obj1 = new SingleThread();
        SingleThread obj2 = new SingleThread();

        obj1.start();
        obj2.start();

        System.out.println(obj1.getName());
    }
}
