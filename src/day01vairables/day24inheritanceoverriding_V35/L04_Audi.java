package day01vairables.day24inheritanceoverriding_V35;

public class L04_Audi extends L02_Car {

    /*
     * 1-If you change the �method body� of a method which is in parent class before using in Child Class, it is �method overriding�
     * 2-In �method overriding�, we do not create a new method. We change the implementation and use it.
     * 3-In �method overriding� you cannot change �method name� you cannot change �method parameters�, and return type.
     * Note: Method name + Method parameter is called Method Signature.
     * So, we do not change �method signature� in method overriding
     * 4- If the implementation is enough do not override
     * 5- Using @override annotation is not must to achieve "overriding" but it has 2 benefits
     * a- Java checks overriding for you. If it is not correct it gives CTE.
     * b- It is good for readability.
     * 6-Changing access modifiers of "overridden methods" in parent class: You can change it to public default but not private, because private can not be accessible
     * from another class
     * 7-Changing "overriding methods" which is called from parent class in child class: you can change it from narrow to wider
     * but not opposite. E.g default to public is ok, but public to default will not complain.
     * 8-"overriding" is in child class, "overridden" is in parent class
     * 9-Access modifier of child class must be wider or equal to access modifier of the parent class.
     * 10-If return type is "primitive" or "void" in overriding, you can not change the return type.
     * 11-If return type is "non-primitive", you should have "IS-A" relationship.
     * 12-For non-primitive return types: Changing Object to String will not complain, because String is child of Object (IS-A relationship)
     * 13-String to Object will complain.
     * 14- We can use both "overriden" and "overriding" methods in child class.
     */

    /*
     * Polymorphism = Method overloading + method overriding
     * Method overloading: add();, add(int a); add(int a, int b);--> Compile Time polymorphism( static polymorphism)
     * Method overriding: move(){"hi"},move(){"bye"} ---> Runtime polymorphism ---> Dynamics polymorphism
     */

    public void price() {
	System.out.println("Audi is expensive");

    }

    @Override
    public void move() {// This is overriding method
	System.out.println("Audi moves very fast");
	super.move();// This comes from parent class
    }

}
