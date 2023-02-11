package day01vairables.day20passbyvaluebyreferencedate_V29;

public class P01_Socrative_mutableimmutable_V31 {

    public static void main(String[] args) {

    }

    public static void equals() {
	String a = "";
	a = a + 2;
	a = a + 'c';
	a = a + false;
	// Each of the a has different heap memory and different references

	System.out.println(a);
	System.out.println(a == "2cfalse");// values are same but references are different
	System.out.println(a.equals("2cfalse"));
    }

}
