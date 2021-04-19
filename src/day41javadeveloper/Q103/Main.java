package day41javadeveloper.Q103;

public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new myThread ());
        Thread t2=new Thread(new myThread ());
        Thread t3=new Thread(new myThread ());

        t1.start();
        t2.run();
        t3.start();

        t1.start();
    }
}
class Mythread implements Runnable{
    public void run (){
        System.out.println("Running");
    }


}


/*
Which one is correct?
A. An IllegalThreadStateException is thrown at run time.
B. Three threads are created.
C. The compilation fails.
D. Four threads are created.
Answer: A
 */