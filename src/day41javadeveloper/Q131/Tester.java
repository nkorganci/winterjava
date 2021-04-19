package Q131;

import static java.util.Arrays.sort;

public class Tester {
    static class Person implements /*line1 */  {
        private String name;
        Person (String name) {this.name=name;}
     /* line 2 */

    }

    public static void main(String[] args) {
        Person[ ] people ={ new Person("Joe"),
                            new Person ("Jane"),
                           new Person ("John") };

       Arrays-sort (people);
        for (Person person :people) {
            System.out.println(person.name);
        }
    }


}

/*
You want the code to produce this output:
John
Joe
Jane
Which code fragment should be inserted on line 1 and line 2 to produce the output?
A. Insert Comparator<Person> on line 1.
Insert
public int compare(Person p1, Person p2) {
return p1.name.compare(p2.name);
}
on line 2.
B. Insert Comparator<Person> on line 1.
Insert
public int compareTo(Person person) {
return person.name.compareTo(this.name);
}
on line 2.
C. Insert Comparable<Person> on line 1.
Insert
public int compare(Person p1, Person p2) {
return p1.name.compare(p2.name);
}
on line 2.
D. Insert Comparator<Person> on line 1.
Insert
public int compare(Person person) {
return person.name.compare(this.name);
}
on line 2.

 */