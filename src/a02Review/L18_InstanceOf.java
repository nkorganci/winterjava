package a02Review;

public class L18_InstanceOf {
}

class DDDParent{

}

class DDD extends DDDParent{
    void run(){
        System.out.println("runnn");
    }

    static void method(DDDParent a){
        if(a instanceof DDD){
            DDD d = (DDD)a;
            System.out.println("Downcasitng completed");
        }
    }

    public static void main(String[] args) {
        DDD obj = new DDD();
        System.out.println(obj instanceof DDD );
        System.out.println(obj instanceof DDDParent);

        // if instance has null value, instanceof return false
        DDD obj1=null;
        System.out.println(obj1 instanceof DDD);

        // Downcasting with java intanceof operator
        //DDD obj2 = new DDDParent(); // Object can not be parent, type can not be smaller than created object.


    }
}