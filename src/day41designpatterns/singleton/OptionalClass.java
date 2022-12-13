package day41designpatterns.singleton;

public class OptionalClass {

    public static void main(String[] args) {

        //If an object may return null, better to use Optional for it.

        OptionalClassTest obj = new OptionalClassTest("cat",22);
        System.out.println(obj.age);
        System.out.println(obj.getName());
        obj.setName("Dog");
        System.out.println(obj.getName());



    }
}
class OptionalClassTest{

    String name;
    int age;
    OptionalClassTest(String name, int age){
        this.age=age;
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
