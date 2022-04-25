package a02Review.garbagecollector;

public class SampleTest {
}

class Test{
    public static void main(String[] args) throws InterruptedException {

        String str = new String("Hello");
        str = null;

        System.gc();

        Thread.sleep(10000);
        System.out.println("end of main");
    }

//    @Override
//    protected void finalize(){
//        System.out.println("finalize method called");
//    }
}
