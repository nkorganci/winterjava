package day00FunctionalProgramming.LambdaExpressions;

public class L01_LambdaExpressions {

    public static void main(String[] args) {
        noParameter();

    }
    public static void noParameter(){

        //Expression with no parameter
        Runnable r= ()->{System.out.println("A compact Runnable!");};
        Thread t1= new Thread(r);

        //No need to mention even Runnable
        Thread t2= new Thread(()->{System.out.println("A compact Runnable!");});

        //No need braces here
        Thread t3= new Thread(()->System.out.println("A compact Runnable!"));

    }
}


//Employee Class
class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}



