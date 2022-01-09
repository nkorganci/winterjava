package day31a_Collections;

public class MultithreadThing extends Thread {
    @Override
    public  void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i + "from" + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int threadNumber;
    public MultithreadThing(int threadNumber){
        this.threadNumber=threadNumber;
    }

    public static void main(String[] args) {

    MultithreadThing myThing1 = new MultithreadThing();
    MultithreadThing myThing2 = new MultithreadThing();
    myThing1.start();
    myThing2.start();

    }
}
