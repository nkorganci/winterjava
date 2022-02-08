package a01codingpractice.hackerrank;

public class Animal {
    void walk(){
        System.out.println("I am walking");
    }
 }

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }

    public static void main(String[] args) {
        Bird obj = new Bird();
        obj.fly();
        obj.walk();
    }
}

