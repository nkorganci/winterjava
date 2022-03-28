package a02java.review;

public class L01_InitializeObject {
    public static void main(String[] args) {

        // Initialize by reference variable
        A referenceVariable = new A();
        referenceVariable.name="Hello";
        System.out.println(referenceVariable.id);

        // Initialize by method
        referenceVariable.methodWithVariables(2," called by method");
        referenceVariable.useVariables();

        // Initialize by constructor
        A obj = new A(33,"constructor",99);
        System.out.println(obj.id);
    }
}

class A{
    int id;
    String name;
    private int privateNum;

    //Constructor
    A(){

    }
    //Constructor with parameter
    A(int id,String name,int privateNum){
        this.id=id;
        this.name=name;
        this.privateNum=privateNum;
    }
    public void methodWithVariables(int id, String name){

    }
    public  void useVariables(){
        System.out.println(id + " " + name);
    }

    //Static Variable
    public static void staticClass(){
        System.out.println("Static class in A");
    }
    //NON-STATIC METHOD
    public void nonStaticClass(){
        System.out.println("Non static class in A");
    }
    //PRIVATE METHOD
    private void privateClass(){
        System.out.println("Private class in A");
    }

}


