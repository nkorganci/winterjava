package day01vairables.day30interfaces_43;

/*
INTERFACE
1- Interface is not a class
2- Interface (title name) can not be private or protected, only public or protected
3- Interface can not have main method
4- Interface can contain only abstract methods
5- Interface is a fully abstraction
6- Why do we use "interfaces",java does not support multiple inheritance, java created interfaces to support it.
    a-When we need to create multiple parent for a child class we use interfaces


2- Private and protected can not be as modifier,All methods in Interfaces must be public
11- Concrete body tell what to do, Interface gives option, focus on functionality.
9- Optional things should be in parent classs
13- All methods in interfaces must be abstract no concrete method.
15- Adding "public" keyword or not will not change , it is default in interface, Adding "abstract" key word or not will not change
16- Interfaces can not have object because it does not have completed methods.
18- Concrete/abstract class to  ===> Interface use "implements"
20- Interface to Interface use extends,
    Interface to concrete imposible, because a concrete class can not be the parent of an interface.
19- When a concrete class has multiple parent interfaces,
the parent interfaces may have same methods and return types.signatures should be same.
21- Only concrete classes override, Interfaces can not.
23- If you can not change method body, no need to override.
22- When you make an interface child of another interface, no need to write override.
24- All variables in interface are public static and final.
    if int x = 2; you can not write x++ or any other operation on x, final values can not be updated


ABSTRACT
1- Abstract is a class.
5- Abstract classes can contain both concrete and abstract
 but abstract class is not
8- Multiple inheritance is impossible even for abstract classes
17- Abstact classes can have constructor to initialize variables, but constructors are not used to create objects.

 */ //INTERFACE




public interface I01 {


}

interface Sound {

    /*
1- No need to write "public" and "abstract" it is default in abstract methods.
 */

    //Methods are public and abstract in an interface
    void sound();

    void increaseVolume();

    void decreaseVolume();

    //Variables in interfaces are "static" and "final", no need to write them.
    public static int LEVEL = 12;
    static int LEVEL1 = 12;
    int LEVEL2 = 12;

}

class Tiger implements Animal, Mammal, Carnivorous {
    @Override
    public void eat() {

    }//Multiple inheritance

} // MUltiple Interface
