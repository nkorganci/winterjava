package day01vairables.day32collections_v47.collectionsAshok;

import java.util.*;

public class A03_ArrayList  {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adam", 2));
        studentList.add(new Student("Adam1", 22));

        for (Student obj1 : studentList) {
            System.out.println(obj1);
        }
    }

    public static void getPropertiesOfArrayList() {
        //Collections sort
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //addAll
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);

        list.addAll(list1);// add the collection at the end
        System.out.println("list as an object " + list);

        // Print list elements

        //1st Way
        System.out.println("========== FOR LOOP ============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2nd Way
        System.out.println("========== FOR EACH LOOP ============");
        for (Object listNum : list) {
            System.out.println(listNum);
        }

        //3rd Way
        System.out.println("========== FOR ITERATOR ============");
        Iterator listIt = list.iterator();
        while ((listIt.hasNext())) {
            System.out.println(listIt.next());
        }

        System.out.println("========== LISTITERATOR ============");
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("========== Lambda expression ============");
        list.forEach(i -> System.out.println(i));
    }

    public static void useStudentClassAsObject() {

    }
}
// ======== This class will be used as object in arrayList ==============
class Student {
    String name;
    int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getString() {
        return name + ", " + id;
    }
}
