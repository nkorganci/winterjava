package day25overridingexceptions_36;

import java.io.IOException;

public class L08_ThrowException {
    /*
The Java throw keyword is used to explicitly throw an exception.
We can throw either checked or uncheked exception in java by throw keyword.
The throw keyword is mainly used to throw custom exception.
 */
}
 //1st Example

class TestThrow1{
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("You are not old enought to vote");
            //System.out.println("You are too young");//Unreacable statement

        }else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        validate(11);
    }
}

class TestExceptionPropagation2{
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }
}