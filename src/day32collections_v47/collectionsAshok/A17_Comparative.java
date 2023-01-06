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
        Collections.sort(emps,new EmpIdComparator());//Sort according to id
        Collections.sort(emps,new EmpNameComparator());//Sort according to name
        Collections.sort(emps, new Comparator<Employee>() {  // We can write the comparative indide the class too
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        // forward and reverse order
//        Collections.sort((emps, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//
//                if (o1.id>o2.id){
//                    return 1;  // By changing these values we can reverse the order
//                }else if(o1.id<o1.id){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });


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

class EmpNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
