package a02Review.thread1;

public class ThreadInitial {
    public static void main(String[] args) {
        Counter o1 = new Counter();
        Counter o2 = new Counter();
        o1.start();
        o2.start();
    }
}



 class Counter extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        int a[] = {2,4};
        for(int b: a){
            System.out.println(b);
        }
    }

}