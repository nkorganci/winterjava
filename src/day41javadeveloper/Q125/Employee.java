package Q125;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Employee {
    public static void main(String[] args) {

    }
    private String name;
    private LocalDate birthday;

    //the constructors,getters, and setters methods go here
   List<Employee> roster= new ArrayList<>();
   // ....

  /*burayi kaldir
    Predicate<Employee> y = (Employee e) -> e.getBirthday()
            .isBefore(IsoChronology.INSTANCE.date(1989,1,1));
    Set<String > s1 =roster.stream()
            //Line 1

}

 burayikaldir  */
/*
A.
        .collect(Collectors.partitioningBy(y))
        .get(true)
        .stream()
        .map(Employee::getName)
        .collect(Collectors.toCollectioning (TreeSet::new));

B.
        .collect(Collectors.partitioningBy(y))
        .get(true)
        .map(Employee::getName)
        .collect(Collectors.toSet());

C.
        .collect(Collectors.partitioningBy(y,Collectors.mapping(
        Employee::getName,Collectors.toSet())));

D.
        .collect(Collectors.partitioningBy(y,Collectors.groupingBy(
        Employee::getName,Collectors.toCollection(TreeSet::new))));



 */





/*
Which code fragment on line 1 makes the s1 set contain the names of all employees born before
January 1, 1989?
A. Option A
B. Option B
C. Option C
D. Option D
Answer: B
 */
