package a04geeksforgeeks;

public class Student {
    int a;
    Student(int a){
        this.a=a;
    }
    void calculate(Student obj){
        System.out.println("Students's id is " + obj.a);
    }

    public static void main(String[] args) {
        Student obj = new Student(2);
        obj.calculate(obj);

    }
}
