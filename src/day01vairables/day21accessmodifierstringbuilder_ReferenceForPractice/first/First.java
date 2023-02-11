package day01vairables.day21accessmodifierstringbuilder_ReferenceForPractice.first;

public class First {

    /*
public	   The code is accessible for all classes
private	   The code is only accessible within the declared class
default	   The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
protected  The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter
     */

    public String str;

    //Constructor
    public First(String str){
        this.str=str;
    }
    // Method 1
    private void showStr(){
        System.out.println(this.str);
    }
    //Method2
   public void show(){
        this.showStr();
    }
    //Static Method
    static void var(){
        // Can not call non static method or variable
    }

    public static void main(String[] args) {

    }

}
