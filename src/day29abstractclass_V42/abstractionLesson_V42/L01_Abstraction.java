package day29abstractclass_V42.abstractionLesson_V42;

public abstract class L01_Abstraction {

    /*
    1- Abstract method has no body
        a-Abstract class: Incomplete class
        b-When you extend a class to "abstract" class, it should complete the abstract method.
        c-Abstract class can have any kind of variable, private, default, private
    2- Declare an abstract method --> abstract void m1(parameter);, abstract is must but in interface no need to write.
    3- When you make a method abstract in abstract class, it must be overridden by concrete child class. Otherwise CTE.
        But if there is a abstract child and abstract parent class relationship , no need to override. Overriding by abstract class is optional.
        All parent abstract classes must be overridden by concrete child class.
        If an abstract class overriden one time, it is not mandatory to override again. Because it is a concrete method now.
    4- Concrete method has body , int sound(){ }
    5- Abstract method must be in abstract class.
    6- Abstract method can be public or protected
    7- A class can be abstract or final
    8- A class can not be private or protected
    9- Abstract class gives to do list, some of them must( only abstract classes), some of them optional (concrete).
    10- Concrete class can be "extended" to abstract class
    11- If you will not change anything from a method which you inherited from parent class, you dont need to override.
        Just call it by object.
    12- If something is must, make it abstract method, if it is optional , concrete method.
    13- Abstract class variables can be static, final, not need to initialize.
    14- Multiple inheritance is impossible even for abstract classes
    15- Abstract classes can have constructor to initialize variables, but constructors are not used to create objects.
     */

//1- Abstract methods must be overridden by child classes
    abstract int add(int... a);

    abstract int subtraction(int... a);

    abstract int division(int a, int b);

    abstract int multiplication(int... a);


   // 2- Concrete classes may/may not be overridden
   public double sqrt(int a) {

        double result = 0;
        try {
            result = Math.sqrt(a);
        } catch (ArithmeticException e) {
            System.out.println("Do not use negative integers");
        }
        return result;
    }


}


