package day26exceptions_37.Socrative_Overriding_Overloading;

/*
1- Method signature should not change in overriding: method name and parameter
2- In overriding body, we should change body.
3- If a method is final, you can not change its body. You can not override
4- If return type is void, you can not change it.
5- Access modifier of child should be wider than parent
6- Private, static and final methods can not be overridden
7- If return types are primitive, all of them must be same
8- If retrun types are non primitive there should be parent child relationship.
9- Overloading parameters must be different
10- Overloading must be in same class.
11- There is no child parent relationship between wrapper classes for overriding ( Integer, Short...)
12- If you add @override annotation, java checks it, otherwise may compile time error.

 */

class A {

    int i = 11;

    public void display() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.display();
        System.out.println(obj.i);
    }
}

class B extends A {
    int i = 18;

    public void display() {
        System.out.println(i);
    }

//    public static void main(String[] args) {
//        A obj = new A();
//        obj.display();
//        System.out.println(obj.i);
//    }
}

//class C {
//    public static void main(String[] args) {
//        A obj = new A();
//        obj.display();
//        System.out.println(obj.i);
//    }
//}