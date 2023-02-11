package day41designpatterns.datastructure;

import java.io.IOException;

//        NOTE 1 ==> Using REFLECTION you can call private constructor, fields, methods..
public class SingletonClassExampleReflection {

    static SingletonClassExampleReflection s = null;// lazy initialization

    private SingletonClassExampleReflection() {

    }

    static public SingletonClassExampleReflection getInstance() {
        if (s == null) {
            s = new SingletonClassExampleReflection();
        }
        return s;
    }

    {
        //Instance initializer block in Java
        if(s!=null){
            try {
                throw new Exception("Object is already present");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class TestReflection {

    public static void main(String[] args) throws NoSuchMethodException, IOException {

        // Reflection
//        Constructor<SingletonClassExampleReflection> obj = SingletonClassExampleReflection.class.getDeclaredConstructor();
//        obj.setAccessible(true);
//        System.out.println(obj.hashCode());

        // Serialization
        //Converting the object into series of bytes and send over network
//        FileOutputStream f = new FileOutputStream("C:\\Users\\korganuj\\Downloads\\TRASH");
//        ObjectOutputStream out = new ObjectOutputStream(f);
//        out.writeObject(obj);

// Cloning
        //Multithreading--> make synchronized


    }

}

