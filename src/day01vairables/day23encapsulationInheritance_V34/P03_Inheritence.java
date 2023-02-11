package day01vairables.day23encapsulationInheritance_V34;

public class P03_Inheritence {

}

class Employee{
    float salary = 40000;

}
class Programmer extends Employee{
    int bonus =10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
    }
}
