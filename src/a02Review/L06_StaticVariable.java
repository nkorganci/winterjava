package a02Review;

public class L06_StaticVariable {


}

class C{
    int id;
    String name;
    static String fname= "College";

    C(int id,String name){
        this.id=id;
        this.name=name;
    }

    void studentClass(){
        System.out.println(id + " " + name + " " + fname);
    }
        public static void main(String[] args) {

        C obj1 = new C(1,"Can");
        C obj2 = new C(2,"David");
        obj1.studentClass();
        obj2.studentClass();
    }
}