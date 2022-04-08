package a02Review.thread;

public class L07_Priority {

}

class C extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C();
        C c3 = new C();

        System.out.println("priority of c1 " + c1.getPriority());
        System.out.println("priority of c2 " + c2.getPriority());
        c1.setPriority(3);
    }
}

