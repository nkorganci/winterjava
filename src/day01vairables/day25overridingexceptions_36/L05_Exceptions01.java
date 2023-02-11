package day01vairables.day25overridingexceptions_36;

import java.io.IOException;

public class L05_Exceptions01 {
    /*
1) Checked Exception
The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions
 e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
The classes which inherit RuntimeException are known as unchecked exceptions
e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.
Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

3) Error
Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.

1-IO is compile time exception, when you write or read a file you may get this exception.
2- Try block can not be used alone, there must be catch block too
3-There can me multiple catch block.

3-ArithmeticExceptions is thrown by Java in Runtime if there is any issue in Mathematical operations.
4-FileNotFoundException occurs in Compile Time, if there is any issue in the Path of the file or in the existence of the file.
5-You can use multiple catch block with a single try block.
 *///1- Difference between Checked and Unchecked Exceptions

    /*

1- try	     The "try" keyword is used to specify a block where we should place exception code.
The try block must be followed by either catch or finally. It means, we can't use try block alone.
*try block is used to enclose the code that might throw an exception.It must be used within the method.

2- catch	The "catch" block is used to handle the exception.
It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

3- finally	The "finally" block is used to execute the important code of the program.
It is executed whether an exception is handled or not.

4- throw	The "throw" keyword is used to throw an exception.
throws	The "throws" keyword is used to declare exceptions.
It doesn't throw an exception. It specifies that there may occur an exception in the method.
It is always used with method signature.
     *///2- HANDLING EXCEPTIONS KEYWORDS

    /*

  try{
//code that may throw an exception
}catch(Exception_class_Name ref){
// Block of code to handle errors
 }
     */// 3- TRY-CATCH BLOCK
    /*
Java finally block
1- Java finally block is a block that is used to execute important code such as closing connection, stream etc
2- Java finally block is always executed whether exception is handled or not.
3- Java finally block follows try or catch block.
4- For each try block there can be zero or more catch blocks, but only one finally block.
 */ //4- Java finally block

    /*
    Throw
    1-We can throw either checked or uncheked exception in java by throw keyword.
    2-The throw keyword is mainly used to throw custom exception.

    Throws: return_type method_name() throws exception_class_name{
    1-The Java throws keyword is used to declare an exception. checked exception declared only
    2-It gives an information to the programmer that there may occur an exception
    3-Exception Handling is mainly used to handle the checked exceptions.
    4-If there occurs any unchecked exception such as NullPointerException,
    it is programmers fault that he is not performing check up before the code being used.
    5-Now Checked Exception can be propagated (forwarded in call stack).
    6-It provides information to the caller of the method about the exception.
    7-Rule: If you are calling a method that declares an exception, you must either caught or declare the exception.
        Case1:You caught the exception i.e. handle the exception using try/catch.
        Case2:You declare the exception i.e. specifying throws with the method.

    Exception propagation
    1-Exception can be handled in any method in call stack
    2-By default, Checked Exceptions are not forwarded in calling chain (propagated).

     */ //5- Java throw exception

    /*
    throws can not be used with new keyword
    throw can be used many times
     */

    public static void main(String[] args) {

//        System.out.println(divideDouble(0, 2));
//        System.out.println(divideDouble(2, 0));// Why it did not giver run time error
//        System.out.println(divideInt(2, 0));//Runtime Error
//        tryBlock();
//        multiCatchBlock();
//       nestedException();
//       finallyBlock();
//        finallyBlockNotHandled();
//        throwException();
    }

    public static double divideDouble(double a, double b) {
        return a / b;

    }

    public static int divideInt(int a, int b) {

	 /*
	  this can not work at the same time with if statement, because this one will cancel exception.
	  if (b == 0) { // This is not a good practice
	    System.out.println("Do not use zero for denominator");
	    return -1;
	}
	  */ //1st Way

        // 2nd Way

        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Can not be divided by 0");
            System.out.println("The rest of the code will work");
        }
        return c;

    }

    public static void ex() {//Common Scenarios of Java Exceptions

        int a = 5 / 0; //ArithmeticException, if we divide any number by 0.

        String str = null;
        System.out.println(str.length());//NullPointerException, if we have a null value in any variable

        String str1 = "abc";
        int i = Integer.parseInt(str1);//NumberFormatException, wrong formatting

        int[] arr = new int[5];//ArrayIndexOutOfBoundsException, inserting any value in the wrong index
        arr[10] = 50;

    }//Common Scenarios of Java Exceptions

    public static void tryBlock() {//solution with/without handling
        /*
        1- It must be used within the method.
        2- Java try block must be followed by either catch or finally block.
        3- We can use multiple catch block with a single try block.
         *///try-catch block notes

        /*
        int a = 2/0;
        System.out.println(a);
        System.out.println("Rest of the code");//the rest of the code is not executed.
         *///without exception handling

        // 1st Way: Exception Handling
        try {
            int a = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);//java.lang.ArithmeticException: / by zero
        }
        System.out.println("Rest of the code");

        //2nd Way: Exception handling using the parent class exception

        try {
            int f = 3 / 0;
        } catch (Exception e) {
            System.out.println(e);//java.lang.ArithmeticException: / by zero
            System.out.println("Numbers can not be divided by zero");
        }
        System.out.println("Rest of the code");

        //3rd Way: Resolve the exception in a catch block

        int i = 12;
        int j = 0;

        int data;
        try {
            data = i / j;
        } catch (Exception e) {
            System.out.println(i / (j + 2));
        }


    }

    public static void multiCatchBlock() {
        int[] a = new int[3];

        try {
            a[20] = 33;
            System.out.println(a[33]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Run the rest of the code");
    }//Order of exceptions should be from specific to general

    public static void multiException(){//
        int a[] = new int[4];
        try {
            a[2]= 33/0;
            a[44] = 33;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (Exception e){
            System.out.println(e);
        }
    }//only one exception occurs and its corresponding catch block is invoked.

//    public  static void multiException1(){
//        int a = 2/0;
//        try{
//            System.out.println(a);
//        }catch (Exception e){
//            System.out.println("Exception Parent class worked " + e);
//        }catch (ArithmeticException e){
//            System.out.println("ArithmeticException " + e);
//        }
//    }//If you dont maintain order CTE (parent to child)// //

    public static void nestedException(){

        try {
            try {
                int a[] =new int[3];
                a[33]=22;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("array");
            }try {
                int a = 2/0;
            }catch (ArithmeticException e){
                System.out.println("Arithmetic");
            }
        }catch (Exception e){
            System.out.println("Handled");
        }
        System.out.println("Rest of the code");

    }
    public static void finallyBlock(){
        try {
            int a= 2/0;
            System.out.println("Arithmetic");
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("This works always");
        }
        System.out.println("Rest of the code");

    }
    public static void finallyBlockNotHandled(){
        try{
            int data=25/0;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println(e);}
        finally{System.out.println("finally block is always executed");}
        System.out.println("rest of the code...");
    }
    public static void throwException(){
        int a = 55;
        if(a<18){
            throw new ArithmeticException("You are under 18");
        }else {
            System.out.println("You are welcome to vote");
        }
    }

}

class TestExceptionPropagation1{
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation1 obj=new TestExceptionPropagation1();
        obj.p();
        System.out.println("normal flow...");
    }
}

//class TestExceptionPropagation2{
//    void m(){
//        throw new java.io.IOException("device error");//checked exception
//    }
//    void n(){
//        m();
//    }
//    void p(){
//        try{
//            n();
//        }catch(Exception e){System.out.println("exception handeled");}
//    }
//    public static void main(String args[]){
//        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
//        obj.p();
//        System.out.println("normal flow");
//    }
//}
//Compile Time ErrorCompile Time Error

class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
class Testthrows2{
    public static void main(String args[]){
        try{
            M m=new M();
            m.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }
}

