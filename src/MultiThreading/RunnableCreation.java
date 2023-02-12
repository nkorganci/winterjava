package MultiThreading;

public class RunnableCreation extends SecondClass implements Runnable {


    @Override
    public void run() {
        System.out.println("Child thread");
    }

    public static void main(String[] args) {
        RunnableCreation obj = new RunnableCreation();
        Thread th = new Thread(obj);
        th.start();
        System.out.println("Main");
        m1();
    }
}

class SecondClass{
    public static void m1(){
        System.out.println("Extended class ");
    }
}
