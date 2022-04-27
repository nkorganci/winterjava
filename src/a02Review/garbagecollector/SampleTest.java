package a02Review.garbagecollector;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;

public class SampleTest {
}

class A{
    public  void run(){
        System.out.println("running in A");
    }
}

class B extends A{
    public  void run(){
        System.out.println("Running in B");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.run();
    }
}