package day25overridingexceptions_36;

public class P02_OverridePractice {
}

class parent{
    static String parentName="Parent";
    static int parentNumber=33;
    String parentNonStatic ="Parent not static";
    void eat22(){
        System.out.println("Parent eat1");
    }
    void eat22(String str){
        System.out.println("Parent eat2: " +str);
    }
}
class child extends parent{
    static int childNumber=2;
    static String childName="Child";
    String childNonStatic = "Child not static";

//    void eat22(){
//        System.out.println("Child eat1");
//    }
//    void eat22(String str){
//        System.out.println("Child eat2: " +str);
//    }
}

class run{
    public static void main(String[] args) {
        // 1 Data type and constructor is PARENT
        /*
        parent obj1 = new parent();
        obj1.eat22();
        obj1.eat22("apple");
        System.out.println(parent.parentName + " " + parent.parentNumber); // I can not reach to child instance variables
        System.out.println(obj1.parentNonStatic);
        */

        //2 Data type and constructor are CHILD
        parent obj2 = new child();
        obj2.eat22();
        obj2.eat22("Orange");
        System.out.println( " From child to  parent: " + parent.parentName + " " + parent.parentNumber);
        System.out.println(" To reach child class statics: " + child.childName + " " + child.childNumber);
//        System.out.println(obj2.childNonStatic +" " + obj2.parentNonStatic);// I can reach to both static and non statics variables






    }
}
