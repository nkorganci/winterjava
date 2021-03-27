package day22stringbuilderencapsulation_31;

public class L04_Encapsulation01 {

    /*
     * 1-Encapsulation means hide something/data
     * 2-How do you achieve encapsulation
     * a-Make the variables private.//for example ssn number
     * b-to read private variables create get methods(getters)
     * c-to update private variable, create set method(setter)
     * 3-access modifier is private
     * 4- if something is not necessary to open it to another class or package, make it private or....
     * 5-Source--->generate setters getters get private ones, open new methods
     * 6- getter, setter are places after private variables
     * 7- Encapsulation is one of the most important part of OOP
     * 8- Setter use always parameter, it update, original value is not changed, just will be updated in another class.
     */

    private String ssn = "1234567890";
    private int salary = 1234;

    public String getSsn() {// They should be public , otherwise entire project can not reach.
	return ssn;
    }

    public int getSalary() {
	return salary;
    }

    public void setSsn(String ssn) {// setters update the value, return type is always void.
	this.ssn = ssn;
    }

    public void setSalary(int salary) {// it uses parameter always
	this.salary = salary;
    }

}
