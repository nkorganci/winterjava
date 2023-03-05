package day41datastructurealgorith;

//        NOTE 1 ==> You need to do FINAL class for not to have inheritance
public  class SingletonClassExample {

//    // WAY 1==>: But this consume memory
//    static SingletonClassExample s = new SingletonClassExample(); // Initialized at class load, eager initialization
//
//    private SingletonClassExample() {
//
//    }
//
//    static SingletonClassExample getInstance() {
//        return s;
//    }
//
// WAY 2==>: When Instance is called , it will take space in memory

   static SingletonClassExample s = null;// lazy initialization

    private SingletonClassExample(){

    }

   static public SingletonClassExample getInstance(){
        if(s==null){
            s= new SingletonClassExample();
        }
        return s;
    }
}

class Test {

    public static void main(String[] args) {

//        NOTE 1 ==> If constructor private, we can not create object
//        SingletonClassExample obj1 = new SingletonClassExample();
//        SingletonClassExample obj2 = new SingletonClassExample();


        SingletonClassExample obj1 = SingletonClassExample.getInstance();
        SingletonClassExample obj2 = SingletonClassExample.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }

}

