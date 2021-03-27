package day20passbyvaluebyreferencedate_V29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class L04_LocalTime {

    // Current time is also used to check which code running faster

    public static void main(String[] args) {
//	localTime();
	name();
//	timeZone();
//	dateTime();
//	timeFormatter();
//	time();
	timeDifferences();
    }

    public static void localTime() {
	LocalTime currentTime = LocalTime.now();
	System.out.println(currentTime);// 07:09:01.758616600 current local time

	// Adding time

	System.out.println(currentTime.plusHours(33));// 16:09:01.758616600, time differences is less than nano seconds.
    }

    public static void name() {// How fast your code or computer is

	LocalTime currentTime1 = LocalTime.now();// 07:12:11.393838500, 100 nano second differences
	System.out.println(currentTime1);

	for (int i = 0; i < 100000; i++) {
	    i++;

	}

	LocalTime currentTime2 = LocalTime.now();
	System.out.println(currentTime2);// 07:12:11.397825400

	System.out.println(currentTime2.getNano() - currentTime1.getNano());// Can be used for performance testing

    }

    public static void timeZone() {// I could not understand this one

	LocalTime currentTime4 = LocalTime.now();
	System.out.println(currentTime4.now(ZoneId.of("Japan")));
	System.out.println(currentTime4.now(ZoneId.of("Turkey")));
	// In order to find ZoneId of another cities, you need to search:)

    }

    public static void dateTime() {// Class for time and date at the same time
	// How to create an object from LocalDateTime
	LocalDateTime currentTime4 = LocalDateTime.now();
	System.out.println(currentTime4);

    }

    public static void timeFormatter() {
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDateTime currentTime4 = LocalDateTime.now();
	// M-->Month, m-->minutes
	// MMM--> first 3 chars
	// MM--> Number of months
	// MMMM-->Full month name
	// M -->Number of month in integer
	// d also has same logic with M.
	// y are same for all values, use only yy or yyyy.
	System.out.println(dtf2.format(currentTime4));
    }

    public static void time() {
	LocalTime currLocalTime = LocalTime.now();
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
	// hh-->is for am-pm time format
	// HH-->is for 24 hours system.
	System.out.println(dtf2.format(currLocalTime));
    }

    public static void timeDifferences() {
	LocalDate d1 = LocalDate.now();
	LocalDate d2 = LocalDate.of(1976, 05, 20);
	Period age = Period.between(d2, d1);// data type is Period
	// Period age = Period.between(d2, d1).getYears();// gives year, data type is
	// int, so change Period to int
	System.out.println(age);

    }
}
