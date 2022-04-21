package a04geeksforgeeks;

public class Exam {

    int b =3;

    Exam(int b){
        this.b= b;
    }
    int c(){
        return b;
    }

    public static void main(String[] args) {

        Exam obj = new Exam(6);
        System.out.println(obj.c());
        System.out.println(obj.b);

    }

}
