package p01_W3resource;

public class Example {
    public static void main(String[] args) {

        String nameOfDay = "monday";

        if (!nameOfDay.equals("monday") || !nameOfDay.equals("tuesday") ||
                !nameOfDay.equals("wednesday") || !nameOfDay.equals("thursday") || !nameOfDay.equals("friday")) {
            System.out.println("Enter a valid day name");
        }

        //What is the purpose of this statement
        if (!nameOfDay.equals("monday") & !nameOfDay.equals("tuesday") &
                !nameOfDay.equals("wednesday") & !nameOfDay.equals("thursday") & !nameOfDay.equals("friday")) {
            System.out.println("Enter a valid day name");

        }


    }
}
