package day40CodeUsingJava;

public class MethodOverloading01 {
}

/*
Explanation -
super.name() - This is call the name method of the state class.

super.super.name() - The syntax is wrong and causes compilation error

(Country)super).name() - The syntax is wrong and causes compilation error

(Country)super.name() - The syntax is wrong and causes compilation error
 */

class Country {
    public void name() {
        System.out.println("Country");
    }
}

class State extends Country {
    public void name() {
        System.out.println("State");
    }
}

class County extends State {
    public void name() {
        /*INSERT HERE*/
        super.name(); //INSERTED: This is call the name method of the state class.

    }
}

class Test123 {
    public static void main(String[] args) {
        Country country = new County();
        country.name();
    }
}