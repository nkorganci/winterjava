package a02Review.thread;

public class L03_Join {
}//Example of join() Method in Java

class ThreadJoin extends Thread{

    // overriding the run() method of Thread
    public void run(){
        for (int i = 0; i <2; i++) {
            try {
                Thread.sleep(300);
                System.out.println("the current thread name is THREAD JOIN" + Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println("Exception has been caught :" + e);
            }
            System.out.println(i);
        }
    }
}

class ThreadJoinExample{
    public static void main(String[] args) {
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

        th1.start();

        try {
            System.out.println("The current thread name is 1: " + Thread.currentThread().getName());
            th1.join();
        }catch (Exception e){
            System.out.println("exceptions: "+ e);
        }


        th2.start();
        try {
            System.out.println("2nd thread name 2" + Thread.currentThread().getName());
            th2.join();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}