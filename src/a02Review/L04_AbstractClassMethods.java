package a02Review;

public class L04_AbstractClassMethods extends A3 {

    public static void main(String[] args) {
        // If you dont override abstract method, it will give error
        //A2 obj = new A2();
A3 obj = new A3(){
@Override
    public void abstractClass(){
    System.out.println("hi");
  }
};
    }



   public void abstractClass(){
       System.out.println("abstract class is implemented ");
    }
}

abstract class A3 {
    //Instance variables
    int x;
    int y;
    //Static variable
    static int z;
    //Empty constructor
    A3(){
        System.out.println("A1 empty constructor is called");
    }
    //Constructor with variable
    A3(int x, int y, int z){
        this.x=x;
        this.y=y;
    }
    //Method to initialize
    public void initializeNums(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void mult(){
        System.out.println(x*y*z);
    }
    public void result(){
        System.out.println(z);
    }
    //Abstract method
    public abstract void abstractClass();


}