package MultiThreading;

public class ThreadCreation extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println("child 1");

        }
    }

    public static void main(String[] args) {

        ThreadCreation obj = new ThreadCreation();
        obj.start();
        System.out.println("Main: 2");


    }
}
