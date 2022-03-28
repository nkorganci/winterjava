package a02Review;

public class L01_InitializeObjectVariables {
    public static void main(String[] args) {

        //1 Initialize with reference variable
        A obj = new A();
        obj.id=2;
        obj.age = 3;
        System.out.println( obj.age + " " + obj.id);

        // 2 Initialize with method
        A obj1 = new A();
        obj1.initialValues(33,99);
        obj1.cal(); // Initialized value is used

        // 3 Initialize with constructor
        A obj2 = new A(22,22);
        System.out.println(obj2.id);
    }
}

class A{
    int id;
    int age;

    A(){

    }

    A(int id, int age){
        this.id=id;
        this.age= age;
    }

    public void initialValues(int id, int age){
        this.id=id;
        this.age=age;
    }
    public void cal(){
        System.out.println(id*age);
    }

}
