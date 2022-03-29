package day12dowhilevariablesconstructorsPractice.constructor;

//Points to remember
//        It is used to create the object.
//        It allocates the memory at runtime.
//        All objects occupy memory in the heap area.
//        It invokes the object constructor.
//        It requires a single, postfix argument to call the constructor
public class NewKeyWord {
    public static void main(String[] args) {

        Parent obj = new Parent();// It call constructor
        obj.id=2;
        System.out.println(obj.id);


    }
}

class Parent{
    //instance variable
    int id;
    //class variable
   static String name;

   //Constructor with parameter
    Parent(String name,int id){
        this.id=id;
        this.name= name;
    }
    //constructor without parameter
    Parent(){
        System.out.println("Constructor is invoked");
    }

    //non static method
    public void sleep(){
        System.out.println("We are sleeping non static");
    }

    public static void run(){
        System.out.println("static run method");
    }
}