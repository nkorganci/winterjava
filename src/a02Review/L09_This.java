package a02Review;

public class L09_This {

}

// 1) this: to refer current class instance variable
class A4 {
    int a = 200;
    int b = 100;
    int c = 300;

    A4() {

    }

    A4(int a, int b, int c1) {
        this.a = a;
        b = b;
        c = c1;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        A4 obj = new A4(2, 1, 3); // we called local variables
        System.out.println(obj.a + " " + obj.b + " " + obj.c); // We are calling clas variables not constructor variables
    }
}

// 2) this: to invoke current class method

class A5 {
    void a() {
        System.out.println("class a");
    }

    void b() {
        System.out.println("class b");
        this.a();
    }

    public static void main(String[] args) {
        A5 obj = new A5();
        obj.b();
    }
}

// 3) this() : to invoke current class constructor

class A6 {
    int a;
    int b;

    A6() {
        this(33, 44);
        System.out.println("no argument constructor 1 " + a + " " + b);
    }

    A6(int a, int b) {
        //this();
        this.a = a;
        this.b = b;
        System.out.println(a + " " + b + " argument constructor");
    }

    public static void main(String[] args) {
        //A6 obj = new A6(2,4);
        A6 obj1 = new A6();
    }
}

// 4) this: to pass as an argument in the method

class A7 {
    void m(A7 obj) {
        System.out.println("method is invoked from m to p");
    }

    void p() {
        m(new A7());
        m(this);
    }

    public static void main(String[] args) {
        A7 obj1 = new A7();
        obj1.p();
    }
}

// 5) this: to pass as argument in the constructor call

class B11 {
    A15 obj;

    B11(A15 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);//using data member of A4 class
    }
}

class A15 {
    int data = 10;

    A15() {
        B11 b = new B11(this);
        b.display();
    }

    public static void main(String args[]) {
        A15 a = new A15();
    }
}

//6) this keyword can be used to return current class instance


class A22 {
    A22 getA22() {
        return this;
    }

    void msg() {
        System.out.println("Hello");
    }
}

class Test1 {
    public static void main(String[] args) {
        new A22().getA22().msg();
    }
}

// Proving this keyword
class A23 {
    void m() {
        System.out.println(this); // this refer to reference of created object.
    }

    public static void main(String[] args) {
        A23 obj = new A23();
        A23 obj1 = new A23();

        System.out.println(obj);
        obj.m();

        System.out.println(obj1);
        obj1.m();
    }
}

// Summary general

class C1 {
    private int a;

    C1() {
        this(2);// 1 - Calling constructor with parameter    }
    }

    C1(int a) {
        this.a = a; // 2- assign the value of parameter to the field variable which has same name
    }
    void sample(){
        int a =3;
        System.out.println(a); // local variable
        System.out.println(this.a); //class/field variable
        System.out.println(this); // refers to this entire object
        System.out.println(this.a);
    }

    public String toString(){
        return "My field" + a; // refers to field a
    }

    public static void main(String[] args) {
    C1 obj = new C1();

    }
}