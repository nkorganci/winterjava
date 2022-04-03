package a02Review;
/*
Anonymous simply means nameless. An object which has no reference is known as an anonymous object.
It can be used at the time of object creation only.
If you have to use an object only once, an anonymous object is a good approach.
 */
public class L02_AnonymousObject {
    public static void main(String[] args) {
        // 3 objects created, looks like they are same but different
        new A1(); // Anonymous object
        new A1().x=2;
        System.out.println(new A1().x);
    }
}

class A1 {
    //Instance variables
    int x;
    int y;
    //Static variable
    static int z;
    //Empty constructor
    A1(){
        System.out.println("A1 empty constructor is called");
    }
    //Constructor with variable
    A1(int x, int y, int z){
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


}