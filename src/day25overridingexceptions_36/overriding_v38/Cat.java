package day25overridingexceptions_36.overriding_v38;

public class Cat extends Animal {

    int age = 3;
    int height =2;


    public static void main(String[] args) {

    }

    @Override
    public void sound() {
        System.out.println("cats meaw");
    }

    @Override
    public void eat() {
        super.add();// super can be used anywhere
        System.out.println(super.age);
        System.out.println("cats eat mil");
        super.creature();
    }

    @Override
    public int add() {
        System.out.println(super.age);//from parent class
        System.out.println(this.age);// from this class
        System.out.println(this.height);// from this class
        return 5 + 5;
        //After return type you can not use super key word
    }

    @Override
    public Integer multiply() {
        return 5*5;
    }

    @Override
    //public Animal creature() is a parent of Cat, will not complain
    public Cat creature() {
        return new Cat();
    }
}
