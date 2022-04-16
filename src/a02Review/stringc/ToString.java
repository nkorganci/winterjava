package a02Review.stringc;

public class ToString {
    String name;
    Integer age;
    ToString(String name,Integer age){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "the name of pet is " + this.name;
    }
    public static void main(String[] args) {

        ToString obj = new ToString("hi",33);
        System.out.println(obj.toString());
        System.out.println(Integer.toString(55));
    }
}
