package day20passbyvaluebyreferencedate_V29;

import java.time.LocalDate;

public class L03_DateClass01 {

    public static void main(String[] args) {

	// How to create date object
	// Obtains the current date from the system clock in the default time-zone.
	// Return: the current date using the system clock and default time-zone, not
	// null

	LocalDate currentDate1 = LocalDate.now();// Now method created new object, can be printed with object name
	System.out.println(currentDate1);// 2021-03-07, we need to update date format

	System.out.println(currentDate1.plusDays(5)); // daysToAdd the days to add, may be negative
	System.out.println(currentDate1.plusMonths(3));// monthsToAdd the months to add, may be negative
	System.out.println(currentDate1.plusYears(2));

	// Change day, month and year at the same time
	System.out.println(currentDate1.plusDays(2).plusMonths(3).plusYears(5));

	// Just get the year,day...
	System.out.println(currentDate1.getYear());// No input
	System.out.println(currentDate1.getDayOfMonth());// No input
	System.out.println(currentDate1.getMonth());// No input
	System.out.println(currentDate1.getDayOfYear());

	// Return to past
	System.out.println(currentDate1.minusDays(44));
	System.out.println(currentDate1.minusDays(3).minusMonths(44).minusYears(44));

	// isAfter compare two dates, return boolean

	LocalDate date2 = LocalDate.of(2020, 11, 11); // Obtains an instance of LocalDate from a year, month and day.
	System.out.println(currentDate1.isAfter(currentDate1.minusDays(33)));
	System.out.println(currentDate1.isAfter(date2));

	// Leap year
	System.out.println(currentDate1.isLeapYear());// False

    }

}
