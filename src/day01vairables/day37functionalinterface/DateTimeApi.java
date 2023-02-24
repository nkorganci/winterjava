package day01vairables.day37functionalinterface;

import java.time.LocalDate;

public class DateTimeApi {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

       LocalDate.of(1976,05,20);
        System.out.println(LocalDate.of(1976,05,20));
    }
}
