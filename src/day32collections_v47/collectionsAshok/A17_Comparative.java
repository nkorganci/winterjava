package day32collections_v47.collectionsAshok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A17_Comparative {
    public static void main(String[] args) {

        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee(41,"1hi",043));
        emps.add(new Employee(4,"8hi",134));
        emps.add(new Employee(14,"0hi",224));
        emps.add(new Employee(4,"hi",334));

        //Prints as insertion order
        for(Employee e: emps){
            System.out.println(e);
        }

        // Using comparative
        Collections.sort(emps,new EmpIdComparator());
        for(Employee e: emps){
            System.out.println("After comparator: "+ e);
        }
    }
}

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmpIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }
}
