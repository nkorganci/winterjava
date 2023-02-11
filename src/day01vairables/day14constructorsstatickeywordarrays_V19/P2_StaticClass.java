package day01vairables.day14constructorsstatickeywordarrays_V19;

public class P2_StaticClass {
    int a;
    int b;
    public static int c;
    //Constructor
    public P2_StaticClass(int a, int b){
        this.a=a;
        this.b=b;
    }
    //method
    public  void methodNonStatic(){
        System.out.println("non static: "+c);
    }
    public static void methodStatic(){
        System.out.println("Static "+ c);
    }
    public static void main(String[] args) {
    P2_StaticClass obj = new P2_StaticClass(2,4);
        System.out.println(obj.a);// default value written in here
        System.out.println(c);

        methodStatic();// Static can be called directly
        obj.methodNonStatic();// NonStatic need object
    }
}
class StaticClass2{
    public static void main(String[] args) {

    }
}
