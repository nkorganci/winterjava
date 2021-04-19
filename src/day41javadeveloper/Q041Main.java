package day41javadeveloper;

import java.time.LocalDate;


import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.TUESDAY;

public class Q041Main {
    public static void main(String[] args) {
        var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
        System.out.println(today);
        switch (today) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekend");
                break;
            case MONDAY:
                FRIDAY:
                System.out.println("Working");
            default:
                System.out.println("Unknown");
        }
    }

    /*
    What is the result?
    A. WorkingUnknown
    B. Unknown
    C. TuesdayUnknown
    D. The compilation fails.
    E. Tuesday
    F. Working

    ANSWER : B//But prints C
*/
}


