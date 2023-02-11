package day01vairables.day36lambda;

import java.util.*;

public class MaxMin {

    public static void main(String[] args) {

        // Maximum Number
      List<Integer> list  = Arrays.asList(1,2,4);
      Integer max = list.stream().mapToInt(t->t).max().orElseThrow(NoSuchElementException::new);
        System.out.println(max);

        //Minimum Number
        Integer min = list.stream().mapToInt(t->t).min().orElseThrow(NoSuchElementException::new);
        System.out.println(min);

        // Customized dataset
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("a",21));
        personList.add(new Person("b",22));
        personList.add(new Person("c",23));
        personList.add(new Person("c",23));

        Optional<Person> minAge = personList.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(minAge);

        // Largest element
        List<Integer> listMax  = Arrays.asList(1,2,4);
        Optional<Integer> maxValue= listMax.stream().max(Integer::compareTo);
        System.out.println("Max: " + maxValue.get());


    }
}

class Person{
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
