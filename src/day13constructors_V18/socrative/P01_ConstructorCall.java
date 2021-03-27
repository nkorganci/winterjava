package day13constructors_V18.socrative;

/*
1-There is always super key word in a consturctor which calls parent constructor
2-
 */

public class P01_ConstructorCall {
    public static void main(String[] args) {


        Mammals22 obj = new Dog22();//I can not call int a = 2; it will give error, because for variables, we need to start from parent
        Mammals22 obj1 = new Dog22();//I can call

    }


}

class Animal22 {
    Animal22 (){
        System.out.println("Animal constructor");
    }

}
class Mammals22 extends Animal22 {

    //super() // for constructor call there is invisible "super()" keyword
    Mammals22(){

        System.out.println("Mammals constructro");
    }
}

class Dog22 extends Mammals22{
    int a = 2;
    Dog22(){
        System.out.println("Dog constructor");
    }
}

