package day32collections_v47.collectionsAshok;

import java.util.ArrayList;
import java.util.Collections;

public class A16_Comparable implements Comparable<A16_Comparable> {

        int id;
        String name;

        public A16_Comparable(int id, String name) {
                this.id = id;
                this.name = name;
        }

        @Override
        public String toString() {
                return "A16_Comparable{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
        }

        @Override
        public int compareTo(A16_Comparable o) {
                return this.id-o.id; // this refers to class id which is necessary
        }
}

class A{
        public static void main(String[] args) {
                ArrayList<A16_Comparable> list = new ArrayList<>();
                list.add(new A16_Comparable(2,"hi"));
                list.add(new A16_Comparable(0,"hi"));
                list.add(new A16_Comparable(3,"hi"));

                Collections.sort(list);
                System.out.println(list);


        }
}