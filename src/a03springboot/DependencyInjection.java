package a03springboot;

public class DependencyInjection {

}

class A{
    static int a = 2;
    public void run(){
        System.out.println("run in A");
    }

}

class B{
    A obj;
    public B(){
        System.out.println("B constructor");
    }
    public  B(A obj){
        this.obj=obj;
    }
//    public void setA(A obj){
//        this.obj=obj;
//    }
    public static void main(String[] args) {




    }
}