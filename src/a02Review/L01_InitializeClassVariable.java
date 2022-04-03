//package a02Review;
//
//public class L01_InitializeClassVariable {
//    public static void main(String[] args) {
//        // 1st way: Reference Variables
//        A obj1 = new A();
//        obj1.x=1;
//        obj1.z=3;
//        System.out.println("z1 " + obj1.z);
//        System.out.println("obj1 " + obj1.x);
//        // 2nd Way: Initialize with method
//        A obj2 = new A();
//        obj2.initializeNums(5,3,8);
//        obj2.mult();
//        // 3rd Way: initialize with constructors
//        A obj3 = new A(9,8,7);
//        System.out.println("z3 " + obj3.z);
//    }
//
//}
//
//class A{
//    //Instance variables
//    int x;
//    int y;
//    //Static variable
//    static int z;
//    //Empty constructor
//    A(){
//    }
//    //Constructor with variable
//    A(int x,int y, int z){
//        this.x=x;
//        this.y=y;
//    }
//    //Method to initialize
//    public void initializeNums(int x, int y, int z){
//        this.x=x;
//        this.y=y;
//        this.z=z;
//    }
//    public void mult(){
//        System.out.println(x*y*z);
//    }
//    public void result(){
//        System.out.println(z);
//    }
//
//
//}