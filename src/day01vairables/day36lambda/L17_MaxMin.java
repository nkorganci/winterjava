package day01vairables.day36lambda;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class L17_MaxMin {
    public static void main(String[] args) {

        List<Teacher> t = new ArrayList<>();
        Teacher a1 = new Teacher(10,"c","b1");
        Teacher a4 = new Teacher(10,"e","b1");
        Teacher a2 = new Teacher(11,"b","b2");
        Teacher a3 = new Teacher(12,"a","b3");

        t.add(a1);
        t.add(a2);
        t.add(a3);
        t.add(a4);
        Optional<Teacher> a = t.stream().max(Comparator.comparing(Teacher->Teacher.getName()));
        System.out.println(a.get());

        // groupingBy() by same age but return only names
        Map<Integer,List<String>> groupByAge = t.stream().collect(Collectors.groupingBy(Teacher::getAge, Collectors.mapping(Teacher::getName, toList())));
        Map<Integer,Long> groupByAge1= t.stream().collect(Collectors.groupingBy(Teacher::getAge,Collectors.counting()));
        System.out.println("res:-> "+groupByAge1);

        // GroupingBy() by same age and same name


    }
}

class Teacher{
    int age;
    String name;
    String lName;

    public Teacher(int age, String name, String lName) {
        this.age = age;
        this.name = name;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
