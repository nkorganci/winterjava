package day30interfaces_43;

/*
1- Interface is not a class, Abstract is a class.
2- Private and protected can not be as modifier
3- Interface can not have main method
4- Interface can contain only abstract class
5- Abstract classes can contain both concrete and abstract
6- Interface is a fully abstractoin but abstract class is not
7- Why do we need Interfaces when we have abstract if we have abstract
   Java does not support multiple inheritance.
   But sometimes we need multiple parents because of that java created "Interfaces"
8- Multiple inheritance is impossible even for abstract classes
9- Optional things should be in parent classs
10- When do we use "interfaces"
    a-When we need to create multiple parent for a child class we use interfaces
    b-"Interfaces" are " to do list" , if you want a child classs to do sth, put them into an interface
11- Concrete body tell what to do, Interface gives option, focus on functionality.
12- All methods in Interfaces must be public
13- All methods in interfaces must be abstract no concrete method.
14- Adding "abstract" key word or not will not change
15- Adding "public" keyword or not will not change , it is default in interface.
16- Interfaces can not have object because it does not have completed methods.
17- Abstact classes can have constructor to initialize variables, but constructors are not used to create objects.
18- Concrete/abstract class to  ===> Interface use "implements"
19- When a concrete class has multiple parent interfaces, the parent interfaces may have same methods and return types.
signatures should be same.
20- Interface to Interface use extends,
    Interface to concrete impposible, because a concrete class can not be the parent of an interface.
21- Only concrete classes override, Interfaces can not.
22- When you make an interface child of another interface, no need to write override.
23- If you can not change method body,not need to override.
 */

public interface I01 {


}
