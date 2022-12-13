package day41designpatterns.singleton;

import java.lang.reflect.Constructor;

//We can make class as final so that there will not be inheritance
final class SingletonClass {



    // 1- When class run it load this instance which consume memory
    //static SingletonClass singleton = new SingletonClass(); // Eager initialization

    // 2- We need to initialize when class called
    static SingletonClass singleton=null; // lazy initialization

    //Instance initializer block in java
    {
        if(singleton!=null){
            throw new Exception("Object is already present");
        }
    }

    private SingletonClass() throws Exception {
if(singleton!=null){
    throw new Exception("Object is already present");
}
   }
   static SingletonClass getSingleton() throws Exception {

       if(singleton==null){
           return new SingletonClass();
       }
    return singleton;
   }
}
class Test{

    public static void main(String[] args) throws Exception {

 SingletonClass instance= SingletonClass.getSingleton();
 SingletonClass obj = SingletonClass.getSingleton();

        System.out.println(obj.hashCode());
        System.out.println(obj.hashCode());

        // Reflection in singleton, I can access the private variables or methods or constructor
        // Using reflection we can get new object but it will not be singleton
      Constructor<SingletonClass> obj3= SingletonClass.class.getDeclaredConstructor();
      obj3.setAccessible(true);
    }
}
