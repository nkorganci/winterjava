package MultiThreading;

public class L02_RunnableInterface{

    public static void main(String[] args) {
        Hi1 obj1 = new Hi1();
        Hello1 obj2 = new Hello1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }


}

class Hi1 implements Runnable{


    @Override
    public void run() {
        System.out.println("Hi1");
    }
}

class Hello1 implements Runnable{


    @Override
    public void run() {
        System.out.println("Hello1");
    }
}
