package day23encapsulationInheritance_V34;

public class L03_Animal {

    /*
     * Benefits of Inheritance()
     * 01- When you inherit from an existing class, you can reuse methods and fields of the parent class.
     * 02- Moreover, you can add new methods and fields in your current class also.
     * 03- For Method Overriding (so runtime polymorphism can be achieved).
     * 04- Class: A class is a group of objects which have common properties.
     * It is a template or blueprint from which objects are created.
     * 05- Sub Class/Child Class: Subclass is a class which inherits the other class.
     * It is also called a derived class, extended class, or child class.
     * 06- Super Class/Parent Class: Superclass is the class from where a subclass inherits the features.
     * It is also called a base class or a parent class.
     * 07- The extends keyword indicates that you are making a new class that derives from an existing class.
     * The meaning of "extends" is to increase the functionality.
     * 1- No repetition, less coding, easy update, easy maintenance.
     * 1- Parent class( super class are same), Child Class( are same with sub class)
     * 2- we store Common class members(variables or methods() into parent class.
     * 3- We store specified class members into child classes.
     * 4- Private class members can not be used by child classes
     * 5- If Child Class and Parent Class are in same package then Child Classes can use the default members in Parent Class.
     * 6- Child classes can use all protected class members in Parent Class.
     * 7- For "public" and "protected" access modifiers "inheritance" works without any issue.
     * 8- For private access modifiers there is no inheritance
     * 9- For default access modifiers you should be careful.
     * 10-A parent class can have multiple child class which is called hierarchical inheritance.
     * 11-Java does not support multiple inheritance.Some other programs support.
     * 12-Multilevel inheritance child --> parent-->grandparent--> grandgrandparent :)
     * 13-Hierarchical inheritance , a parent class can have multiple child class.
     * 14-Java does not support multiple inheritance, extend to multiple parents is not used in java.
     * 15-Object class is the top parent, has no parent.
     * 16-IS-A is used from child to parent, HAS-A is used from parent to child
     */

    public void eat() {
	System.out.println("They eat...");
    }

    public void drink() {
	System.out.println("They drink...");
    }

}
