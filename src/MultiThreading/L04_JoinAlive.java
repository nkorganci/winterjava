package MultiThreading;

public class L04_JoinAlive {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.print("A" +i +" ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.print("B"+i+" ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        System.out.println("I am in a main method");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        //Thread Name
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //Customized thread name
        t1.setName("a");
        System.out.println(t1.getName());

//        t1.join();
//        t2.join();
    }
}
