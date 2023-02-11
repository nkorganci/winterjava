package day01vairables.day40CodeUsingJava;


public class Constructor01 {
}
//----------------------------------------
/*
Explanation -
At line 1 the new object that is created does not have any reference so it is eligibe.
At line 2 a new object gets created which has a reference emp. But later this reference
emp is assigned to another object in line 4. So this object is also eleigible
for garbage collection
So there are 2 objects eligible for garbage collection
 */
class Employee {
}

class Test051 {
    public static void main(String[] args) {
        new Employee(); // line 1
        Employee emp = new Employee(); // line 2
        assign(emp); // line 3
        System.out.println("CodeUsingJava"); // line 5
    }

    public static void assign(Employee emp) {
        emp = new Employee(); // line 4
    }
}