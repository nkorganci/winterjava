package day14constructorsstatickeywordarrays_V19;

// CONSTRUCTOR -> is used to initialize static and non static CLASS variables
public class A {
   static int a;
    static int b;

    public A(){

    }
    public A(int a){  // no RETURN data types
        a++;
        this.a=a;

    }

    public static void main(String[] args) {
        A obj = new A(3);
        System.out.println(obj.a);
        A obj1 = new A(obj.a);
        System.out.println(obj1.a);


    }


}
