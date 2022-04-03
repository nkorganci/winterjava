package a02Review;

public class L13_Overriding {
}

class Parent{
    int a =10;
    static int b = 100;
    public void print(){
        System.out.println("b superclass");
    }
    static public void print1(){
        System.out.println("b superclass");
    }
}

class Child extends Parent{
   int a = 20;
   static int b = 200;
    public void print(){
        System.out.println("Child");
    }
   static public void print1(){
        System.out.println("Child");
    }
}

class Start{
    public static void main(String[] args) {
        // Creating a parent class object
        Parent obj =new Child();
        obj.print(); // non- static, checks object
        obj.print1();// static check data type
        Parent.print1();
        Child.print1();

        Child obj1 = new Child();
        obj1.print();
        obj1.print1();
        System.out.println(obj.a);// checks parent
        System.out.println(obj1.a);

        System.out.println(obj.b);
        System.out.println(obj1.b);



    }
}
