package a02Review;

public class L21_Encapsulation {
}

class Student{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Student obj = new Student();
       obj.setName("Hi");
        System.out.println(obj.getName());
        System.out.println(obj.name);
    }
}