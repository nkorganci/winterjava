package a02Review;

public class L19_Abstraction {
}

abstract class AbstractParent{
    abstract void eat();
    void run(){
        System.out.println("run non static");
    }
    static void talk(){
        System.out.println("talk static");
    }
}

class NotAbstract extends AbstractParent{
    void eat(){
        System.out.println("eat inherited");
    }
    public static void main(String[] args) {
        //AbstractParent obj = new AbstractParent();  // can not be instantianeted

        NotAbstract obj = new NotAbstract();
        obj.run();
    }
}

// Real life example
abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle1 extends Shape{
    void draw(){
        System.out.println("Drawing circle...");
    }
}

class TestAbstraction1{
    public static void main(String[] args) {
        Shape s = new Circle1();
        s.draw();
    }
}

// Another example
abstract class Bank1{
    abstract int getRate();
}

class SBI extends Bank1{
    int getRate(){
        return 3;
    }
}
class SBI2 extends Bank1{

    @Override
    int getRate() {
        return 11;
    }
}

class TestBank{
    public static void main(String[] args) {
        Bank1 b;
        b= new SBI();
        System.out.println("rate of interest " + b.getRate());
    }
}

//Abstact class can be implement just one time.

abstract class Dd{
    abstract void run();
}
class Ddd extends Dd{

    @Override
    void run() {

    }
}

class Dddd extends Ddd{

}