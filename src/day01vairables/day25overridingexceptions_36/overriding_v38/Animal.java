package day01vairables.day25overridingexceptions_36.overriding_v38;

public class Animal {
    int age = 17;
    String name = "Joe";

     public void sound() {
        System.out.println("Animals make sound");
    }

    public void eat() {
        System.out.println("Animals eat");
    }

    public int add() {
        return 2+ 2;
    }

    public Integer multiply() {
        return 4 * 4;
    }
    public Animal creature (){
        return new Animal();
    }

}
