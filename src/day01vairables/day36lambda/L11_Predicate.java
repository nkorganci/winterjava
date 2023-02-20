package day01vairables.day36lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class L11_Predicate {


    public static void main(String[] args) {

        // Test if number>2
        Predicate<Integer> p = (t)->t>2;
        System.out.println(p.test(3));
    }

    public static void count(){

    }
}

class Doctor{
    String name;
    int salary;
    int experience;

    public Doctor(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public static void main(String[] args) {

        // Return the employee names whose sal>50 and exp>3
        Doctor d1 = new Doctor("a1",20001, 31);
        Doctor d3 = new Doctor("a2",20002, 32);
        Doctor d2 = new Doctor("a3",20003, 33);

        List<Doctor> arr = new ArrayList<>();
        arr.add(d1);
        arr.add(d2);
        arr.add(d3);


        Predicate<Doctor> name = (a)->(a.experience>200&&a.salary<2);
        Predicate<Doctor> name1 = (a)->(a.experience>200&&a.salary<2);



        //Testing 2 condtion



    }
}
