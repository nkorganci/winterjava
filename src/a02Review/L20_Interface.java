package a02Review;

public interface L20_Interface {
}

interface A{
    int MIN=2;
    static int b = 3;
    void run();

    // Methods are always public abstract
    //Variables are always static final
    public static final int MAX=3;
    public abstract void run1();
}

interface printable{
    void print2();
}
class AC implements printable{
    public void print2(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        AC obj = new AC();
        obj.print2();
    }
}

// Multiple implements by interface or class

interface multiple{
    void write1();
}
interface multiple1{
    void write();
}
abstract class mul1 implements multiple,multiple1{

    public void write1(){
        System.out.println("hiiii");
    }
   public void write(){
        System.out.println("hiiii");
    }

}

// default  and static method in INTERFACE

interface BA{

}
