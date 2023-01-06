package day32collections_v47.collectionsAshok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A16_Comparable {
    public static void main(String[] args) {

        List<Student1> al = new ArrayList<>();
        al.add(new Student1(1,"c",2));
        al.add(new Student1(3,"b",4));
        al.add(new Student1(2,"b",4));
        al.add(new Student1(0,"f",4));

        System.out.println(al);// [Student1{id=1, name='a', rank=2}, Student1{id=3, name='b', rank=4}, Student1{id=2, name='b', rank=4}, Student1{id=0, name='b', rank=4}]
        Collections.sort(al); // Student1{id=0, name='b', rank=4}

        for(Student1 t: al){
            System.out.println(t);
        }

    }
}

class Student1 implements Comparable<Student1>{
    int id;
    String name;
    int rank;

    public Student1(int id, String name, int rank){
            this.id=id;
            this.name=name;
            this.rank=rank;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
//        return this.id-o.id; // It will compare according to id
        return this.name.compareTo(o.name);// We can compare relative to any of the field
    }
}

class Student2 implements Comparator<Student2> {
    int id;
    String name;
    int rank;

    public Student2(int id, String name, int rank){
        this.id=id;
        this.name=name;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.id-o2.id;
    }
}
