package day36lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingBy {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("a",1,1));
        list.add(new Employee("ab",1,1));
        list.add(new Employee("a",12,1));
        list.add(new Employee("a",1,14));

        //Categorize according to Single Column.
       Map<String, List<Employee>> map =  list.stream().collect(groupingBy(Employee::getName));
        System.out.println(map);

        //Grouping by multiple Fields
      Map<String, Map<Integer,List<Employee>>> a =   list.stream().collect(groupingBy(Employee::getName, groupingBy(Employee::getAge)));
        System.out.println(a);


    }
}

class Employee{
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
