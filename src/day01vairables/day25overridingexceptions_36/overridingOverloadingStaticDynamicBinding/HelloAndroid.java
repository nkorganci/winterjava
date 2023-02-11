package day01vairables.day25overridingexceptions_36.overridingOverloadingStaticDynamicBinding;


public class HelloAndroid {
    public static void main(String[] args) {

        //Reference variable is Parent class which pointing to object of Child class
        // Child p = new Child();
       // p.whoAmI();// from Child class if reference type is child

        //1 Static Method call, reference data type decide parent or child method will work or not.
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child  p3 = new Child();

        p1.whoAreYouNonStatic(); // call Parent method, Object is Parent
        p1.whoAmIStatic(); //call Parent method, data type is parent
        //p1.whoPrivate(); // is not accessible, private
        System.out.println("P2---------------");

        p2.whoAreYouNonStatic(); // If it is non static child method will appear, for non static it checks child first
        p2.whoAmIStatic(); // since this is static , data type is parent , first its method will appear.

        System.out.println("p3-------------");
        p3.whoAreYouNonStatic();// Child non-static, check object which is child so child will appear
        p3.whoAmIStatic(); // Data type is child, so child will appear. If there is no child static, it will go parent.


    }
}

//PARENT CLASS
// Private and static methods can not be overridden, they hide super-class implementation
class Parent{
    private void whoPrivate(){
        System.out.println("Inside private method Parent#who()");

    }
    public static void whoAmIStatic(){

        System.out.println("Inside static method, Parent#whoAmI()");
    }
    public void whoAreYouNonStatic(){

        System.out.println("Inside virtual method, Parent#whoAreYou()");
    }
}

//CHILD CLASS
class Child extends Parent{
    private void whoPrivate() {
    System.out.println("Child#who() private");
}
    public static void whoAmIStatic(){
    System.out.println("Child#whoAmI() static");
}

   @Override
    public void whoAreYouNonStatic() {
    whoPrivate();
    System.out.println("Child#whoAreYou() non static");
}
}

