package day01vairables.day25overridingexceptions_36.overriding_v38;

/*
1- If the data type (left side) is parent, you can not access child class methods.
2- "super" key word can be used as much as you want, anywhere. Data will come from parent class
3- "this" key word can be called many times too. method or variable only form this classcn be called.
 */
public class Runner {
    public static void main(String[] args) {

        //obj1
        Animal obj1 = new Animal();

        //obj2
        Animal obj2 = new Cat();

        //obj3
        Cat obj3 = new Cat();
        obj2.eat(); //super.eat will call parent too
        System.out.println(obj2.add());


    }
}
