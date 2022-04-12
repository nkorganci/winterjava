package a02Review.thread1;

public class ThreadSleep extends Thread {
    int id;
    String name;

    ThreadSleep(int id, String name){
        this.name=name;
        this.id=id;
    }

    @Override
    public void run(){

        System.out.println(this.id + " " + this.name);
        for (int i = 0; i < 10; i++) {
            System.out.println(this.name+ " "+ i);
            try {
                Thread.sleep(1000L*this.id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TestSleep{
    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep(1,"thread 1");
        ThreadSleep t2 = new ThreadSleep(2,"thread 2");
        t1.start();
        t2.start();
    }
}
