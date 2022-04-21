package a04geeksforgeeks;

public class Base {
    public static void print(){
        System.out.println("Base");
    }
}
class Derived extends Base{
    public static void print(){
        System.out.println("Derived");
    }
}
class Main1{
    public static void DoPrint(Base o){
        o.print();
    }

    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
// If all methods are static and has extended class, it will start from parent class.
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}