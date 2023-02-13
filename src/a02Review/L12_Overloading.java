package a02Review;


public class L12_Overloading {

    void cal(int a, int b){
        System.out.println( a + b);
    }
    void cal(float a, float b){
        System.out.println( a + b);
    }
    public static void main(String[] args) {
        L12_Overloading obj = new L12_Overloading();
        obj.cal(2,42);
        obj.cal(3.3f, 2.2f);
    }
}

// Method Overloading with Type Promotion in case of ambiguity
class D10{
    void cal1(long a,int b){
        System.out.println(a+b);
    }
    void cal1(int a, long b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        D10 obj = new D10();
        //obj.cal1(2,4); compile time error
    }
}

class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike extends Vehicle{
    public static void main(String args[]){
        //creating an instance of child class
        Bike obj = new Bike();
        //calling the method with child class instance
        obj.run();
    }
}

// compile time polymorphism

class AB{
    static void run(){
        System.out.println("run");
    }
    static void run(String a){
        System.out.println("run1");
    }

    void run(int a){
        System.out.println("non static");
    }

    public static void main(String[] args) {
        AB.run("HI");
    }
}

// Static binding

class DD{
    private void run(){
        System.out.println("private");
    }
    void run(String a){
        System.out.println("non static");
    }

    public static void main(String[] args) {
        DD obj = new DD();
        obj.run();
    }
}
