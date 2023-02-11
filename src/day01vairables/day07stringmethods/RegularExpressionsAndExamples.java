package day01vairables.day07stringmethods;

public class RegularExpressionsAndExamples {
    public static void main(String[] args) {
regularExpressionsExample02();

    }


    public static void regularExpressionsLesson(){
                    	/*
	 Regular expressions ==>
	 1) \\s: space character
	 2) \\S: all characters except space character
	 3) \\w: a->z  A ->Z  _  0->9
	 4) \\W: All characters except  a->z A ->Z _ 0->9
	 5) \\d: 0-9 changes only digits.
	 6) \\D: 0-9 changes ALL except digits.Opposite of d expression.
	 */

        String str = "Java123 learn, earn_money!!  .";
        System.out.println(str.replaceAll("\\s", "*"));
        System.out.println(str.replaceAll(" ", "*"));
        System.out.println(str.replaceAll("\\S", "*"));
        System.out.println(str.replaceAll("\\w", "*"));
        System.out.println(str.replaceAll("\\W", "*"));
    }
    public static void regularExpressionsExample01() {
        /*
        TASK: By using String methods change the String  "    Ali123 can?!     "  to Ali CAN
        */

        String a = "    Ali123 can?!      ";
        System.out.println(a);

        //1st Way
        String result = a.replaceAll("\\W", "").replace("123", " ").replace("can", "CAN");
        System.out.println(result);

        //2nd Way
        String b = "    Veli123 can?!      ";
        System.out.println(a);

        String firstName = b.substring(4,8);
        String lastName = b.substring(12,15).toUpperCase();
        System.out.println(firstName +" " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));// concat() is created for String methods.

    }
    public static void regularExpressionsExample02(){
        //Find the sum of the Strings

        String str1 = "$12.99";
        String str2 = "$8.00";

        String a = str1.replaceAll("\\D", "");
        String b = str2.replaceAll("\\D", "");
        System.out.println(a);
        System.out.println(b);

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        System.out.println(c + d);


        // How to convert String to a decimal

        String str5 = "$13.99";
        String str6 = "$9.00";

        String str7 = str5.replace("$", "");
        String str8 = str6.replace("$", "");

        System.out.println(str7);
        System.out.println(str8);

        System.out.println(Double.parseDouble(str7) + Double.parseDouble(str8));
        System.out.println(Double.valueOf(str7) + Double.valueOf(str8));

    }

}
