package day01vairables.day30interfaces_43.interfacelesson_V43;

public interface L01_I001 {
        /*
INTERFACE
1- Interface is not a class
3- Interface can not have main method
    exception: Since Java 8, we can have method body in interface. But we need to make it default method
    ex: default void msg(){System.out.println("default method");

    Since Java 8, we can have static method in interface.
    static int cube(int x){return x*x*x;}

4- Interface can contain only abstract class, Interface is a fully abstraction
5- When do we use "interfaces"
    a-When we need to create multiple parent for a child class we use interfaces
    b-If there are multiple must functions, a parent class my confuse, so multiple parent may give options,
    and will be easy to select options or organize
    c-Interfaces are "to do" list, if you want a child class to do sth,put them in interfaces.
6- class --> interface(multiple)--> Interface, Optional things should be in parent classs
7- Concrete class decide functionality, no option. interface gives options, you will write what to do.
8- No need to write public or abstract in interface because all of them are abstract.
    However in abstract class, you must write.
9- Methods can have only public modifier, you may/not add.
11 All Variables in an interface are public, static and final
12- In Java, static final variables are constants and the convention is that they should be in UPPER-CASES.
13- Interfaces has incomplete methods, so we can not create object
14- Interfaces do not have constructors. Abstract classes have constructors to initialize variables.
15- Concrete/abstract class to ==> implements ===> Interface name
    interface--->extends--->interface
16- Interface to Interface use extends,
    Interface to concrete impossible, because a concrete class can not be the parent of an interface.
17- Interfaces can have same methods with same method signature( return type too),
    child class will use one of them because they dont have body. You can modify
18-  Only concrete class must override, interface and abstract classes may/not override.
19- When you make an interface child of another interface, no need to write override.
20- When you make an interface child of another interface, no need to override abstract methods, because it is also interface
24- All variables in interface are public static and final.
    if int x = 2; you can not write x++ or any other operation on x, final values can not be updated

 */ //INTERFACE

    void name1();
}


