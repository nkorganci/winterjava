package a02Review;

public class L09_This {

}
// 1) this: to refer current class instance variable
class A4{
    int a=200;
    int b=100;
    int c = 300;
    A4(){

    }

    A4(int a, int b, int c1){
        this.a= a;
        b=b;
        c=c1;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        A4 obj = new A4(2,1,3); // we called local variables
        System.out.println(obj.a + " " + obj.b + " " + obj.c); // We are calling clas variables not constructor variables
    }
}

// 2) this: to invoke current class method

class A5{
    void a(){
        System.out.println("class a");
    }
    void b(){
        System.out.println("class b");
       this.a();
    }

    public static void main(String[] args) {
        A5 obj = new A5();
        obj.b();
    }
}

// 3) this() : to invoke current class constructor

class A6{
    int a;
    int b;

    A6(){
        this(33,44);
        System.out.println("no argument constructor 1 " + a + " " + b);
    }

    A6(int a, int b){
        //this();
        this.a=a;
        this.b= b;
        System.out.println(a+ " " + b + " argument constructor");
    }

    public static void main(String[] args) {
        //A6 obj = new A6(2,4);
        A6 obj1  = new A6();
    }
}

// 4) this: to pass as an argument in the method

class A7{
    void m(A7 obj){
        System.out.println("method is invoked from m to p");
    }

    void p(){
        m(new A7()) ;
        m(this);
    }

    public static void main(String[] args) {
        A7 obj1 = new A7();
        obj1.p();
    }
}

// 5) this: to pass as argument in the constructor call