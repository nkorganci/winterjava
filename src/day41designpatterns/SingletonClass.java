package day41designpatterns;

//We can make class as final so that there will not be inheritance
final class SingletonClass {

    // 1- When class run it load this instance which consume memory
    //static SingletonClass singleton = new SingletonClass(); // Eager initialization

    // 2- We need to initialize when class called
    static SingletonClass singleton=null; // lazy initialization

   private SingletonClass(){

   }
   static SingletonClass getSingleton(){

       if(singleton==null){
           return new SingletonClass();
       }
    return singleton;
   }
}

class Test{

    public static void main(String[] args) {

 SingletonClass instance= SingletonClass.getSingleton();

 SingletonClass obj = SingletonClass.getSingleton();

        System.out.println(obj.hashCode());
        System.out.println(obj.hashCode());


    }
}
