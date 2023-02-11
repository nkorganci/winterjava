package day01vairables.day22stringbuilderencapsulation_31;

public class L05_Encapsulation02 {

    public static void main(String[] args) {

	L04_Encapsulation01 obj1 = new L04_Encapsulation01();

	System.out.println(obj1.getSsn().equals("1234"));// Return false because original value is 123456789

	obj1.setSsn("1234");// ssn is updated now

	System.out.println(obj1.getSsn().equals("1234"));// Return true because ssn is updated.

	System.out.println(obj1.getSsn());// Updated only in this class, original value in another class is same.

    }

}
