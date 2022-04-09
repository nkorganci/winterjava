package a02Review;

public class L14_SuperKeyWord {
}
// 1 Super is used to call parent variable or method
class E{
    String name ="Parent E string";
    void print(){
        System.out.println("parent E");
    }
}
class E1 extends E{
    String name = super.name;
    void print(){
        super.print();
        System.out.println("child e1");
    }
}
class M{
    public static void main(String[] args) {
        E1 obj = new E1();
        obj.print();
    }
}
// 1) super is used to refer immediate parent class instance variable.
class E01{
    String color = "White";
    static String str = "static";
}
class E02 extends E01{
    String color = "Black";
    void printColor(){
        System.out.println(color); // print black
        System.out.println(super.color);// print white
        System.out.println(E01.str);
    }
    public static void main(String[] args) {
        E02 obj = new E02();
        obj.printColor();
    }
}

/*
2) super can be used to invoke parent class method
The super keyword can also be used to invoke parent class method.
It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
 */
class E03{
    void eat(){
        System.out.println("eating...");
    }
}
class E04 extends E03{
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("barking");
    }
    void work(){
        super.eat();// if you dont use super, it will not call the parent eat.
        bark();
    }
}

class E05{
    public static void main(String[] args) {
        E04 obj = new E04();
        obj.work();
    }
}

/*
3) super is used to invoke parent class constructor.
The super keyword can also be used to invoke the parent class constructor.
 */

class E06{
    E06(){
        System.out.println("Animal is created...");
    }
}

class E07 extends E06{
    E07(){
        super();
        System.out.println("dog is created...");
    }
}

class E08{
    public static void main(String[] args) {
        E07 obj = new E07();
    }
}

// Another example of super keyword where super() is provided by the compiler implicitly.

class E09{
    E09(){
        System.out.println("Animal is created");
    }
}

class E10 extends E09{
    E10(){
        // super(); // we have a hidden super key here.
        System.out.println("dog is created");
    }
}

class Run1{
    public static void main(String[] args) {
        E10 obj = new E10();
    }
}

// Real use of super key word
class Person{
    int id;
    String name;
    //Constructor to initialize
    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
}

class Emp extends Person{
    float salary;
    Emp(int id,String name, float salary){
        super(id,name);
        this.salary= salary;
    }

    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}

class Run01{
    public static void main(String[] args) {
        Emp obj = new Emp(1,"Hi",33f);
        obj.display();

    }

}