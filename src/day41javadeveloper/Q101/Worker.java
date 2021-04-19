package day41javadeveloper.Q101;

public class Worker {
    public synchronized void work (Resource ... resources){

        for (int i=0; i<10; i++){

            while (!resources[0].claim(this)) { }
            while (!resources[1].claim(this)) { }

            //do work with resource

            resources[1].release();
            resources[0].release();

        }

    }
}

/*And given this fragment:
 Worker w1 =new Worker ();
 Worker w2 =new Worker();
 Resource r1=new Resource();
 Resource r2=new Resource();
 new Thread( () -> {
     w1.work(r1,r2);
         }).start();

         new Thread( () -> {
         w2.work(r2,r1);
         }).start();

Which describes the fragment?
A. It throws IllegalMonitorStateException.
B. It is subject to deadlock.
C. It is subject to livelock.
D. The code does not compile.
Answer: D
 */