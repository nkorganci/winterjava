package Q126;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Employee> list= List.of(new Employee ("John",80000.0),new Employee ("Scott",90000.0));
        double starts=0.0;
        double ration=1.0;
        BinaryOperator<Double> bo = (a,b) -> a+b;
        double totalSalary=list.stream().map(e -> e.getSalary() * ratio).reduce(starts, bo);
        //line1
        System.out.println("Total salary= " +totalSalary);
    }
}
/* ayri bi class olusturuldu
class Employee {
    String name;
    double salary;
    public Employee (String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){return name; }
    public double getSalary{} {return salary;}
}

*/

/*
Which statement is equivalent to line 1?
A. double totalSalary = list.stream().map(e −> e.getSalary() * ratio).reduce (bo).ifPresent (p −>
p.doubleValue());
B. double totalSalary = list.stream().mapToDouble(e −> e.getSalary() * ratio).sum;
C. double totalSalary = list.stream().map(Employee::getSalary * ratio).reduce (bo).orElse(0.0);
D. double totalSalary = list.stream().mapToDouble(e −> e.getSalary() * ratio).reduce(starts, bo);
ANSWER C

 */