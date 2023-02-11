package day01vairables.day20passbyvaluebyreferencedate_V29;

public class P02_Socrative_mutableimmutable {

    public static void main(String[] args) {

	String str = "Learn";

	System.out.println(join("Java"));

	System.out.println(str);

    }

    public static String join(String str) {
	return str + "Java";
    }

}
