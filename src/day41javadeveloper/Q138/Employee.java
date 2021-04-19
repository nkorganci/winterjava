package Q138;



public class Employee { //Answer:B
    /*
    private String name;
    private LocalDate birthday;
    //the constructors, getters, and setters methods go here
}
//and
  List<Employee> roster = new ArrayList<>();
//...
Predicate<Employee> y = (Employee e) ->e.getBirthday().isBefore(IsoChronology.INSTANCE.date(1989, 1, 1));

Set<String> s1 = roster.stream()
        //Line1

     */


}

//Which code fragment on line 1 makes the s1 set contain the names of all employees born before January 1, 1989?

//A.collect(Collectors.partitioningBy(y))
// .get(true)
// .stream()
// .map(Employee::getName)
//.collect(Collectors.toCollection(TreeSet::new));
//B.collect(Collectors.partitioningBy(y))
// .get(true)
// .map(Employee::getName)
//.collect(Collectors.toSet());
//C.colect(Collectors.partitioningBy(y, Collectors.mapping(
//        Employee::getName, Collectors.toSet())));
//D.collect(Collectors.partioningBy(y, Collectors.groupingBy(Employee::getName, Collectors.toCollection(TreeSet::new))));

