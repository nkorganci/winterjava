package day01vairables.day36lambda.lambdaaskhok.java8stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int id;
    public Employee(){
    }
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
    }
}

class StreamExample{
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee("ah",1));
        list.add(new Employee("abh1",11));
        list.add(new Employee("ch2",12));

        // Print employee name whose name start with A with traditional way
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().charAt(0)=='a'){
                System.out.println(list.get(i).getName());
            }
        }

        // Print employee with Lambda expressions

        list.stream().filter((x)->x.getName().startsWith(("a"))).forEach((x)-> System.out.println(x.getName()));
        // Print all names to list
        List<String> names=  list.stream().map((x)->x.getName()).collect(Collectors.toList());

        //Who is getting minimum salary
        Employee d = list.stream().min((x,y)->x.getId()-y.getId()).get();
        System.out.println(d.getId());

        // Example 2

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(4);
     List<Integer> ab=   a.stream().distinct().collect(Collectors.toList());
        System.out.println(ab);

        a.stream().sorted().forEach((x)-> System.out.println(x));// sort in order
        a.stream().sorted(Collections.reverseOrder()).forEach((x-> System.out.println(x)));// Reverse order

    }
}
