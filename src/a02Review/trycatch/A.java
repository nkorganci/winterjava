package a02Review.trycatch;

public class A {
    public static void main(String[] args) {

    }
}

interface B{
   void read();
   default void jump(){

   }
}

abstract class C{
    abstract void run();
    void jump(){
        System.out.println("jump");
    }
}
class D{
     void write(){
         System.out.println("body");
     }
}
