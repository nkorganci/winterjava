package a02Review;

public class AE {
}

class Class1{
    public void display(){
        System.out.println("Display method inside Class1.");
    }
    public static void displayS(){
        System.out.println("Display method inside Class1.");
    }
}

class Test extends Class1{
    public void display(){
        System.out.println("Display method inside Class2.");
    }
    public static void displayS(){
        System.out.println("Display method inside Class1.");
    }
    public static void main(String args[]){
        Test obj = new Test();
        obj.display();
       obj.displayS();
    }
}