package Q121;

import java.util.List;

public class Question121 {
    public static void main(String[] args) {
    //    var numbers = List.of(0,1,2,3,4,5,6,7,8,9);
    //    double avg=numbers.parallelStream().mapToInt(m -> m).average().getAsDouble();
    }
}
/*
var numbers = List.of(0,1,2,3,4,5,6,7,8,9);
You want to calculate the average of numbers. Which two codes will accomplish this? (Choose two.)
A. double avg = numbers.stream().parallel().averagingDouble(a −> a);
B. double avg = numbers.parallelStream().mapToInt (m −> m).average().getAsDouble ();
C. double avg = numbers.stream().mapToInt (i −> i).average().parallel();
D. double avg = numbers.stream().average().getAsDouble();
E. double avg = numbers.stream().collect(Collectors.averagingDouble(n −> n));
Answer: BD
 */