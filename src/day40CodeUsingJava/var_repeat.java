package day40CodeUsingJava;

public class var_repeat {
    /*
    Explanation -
Java String repeat() method returns a new string whose value is the concatenation of this string given number of times.

When we use var.repeat(2) its value will be printed as "--".
In above example however in the print statement we are checking for equality.
repeat method uses the String class constructor to create a new String Object in the non pool memory.
So when we compare this object with literal "--" using == it return false. If we use equals it will return true
     */
}

class Teasdfst33 {
    public static void main(String[] args) {
        final String var = "-";
        //var = var + "x";// If I assign to another one give error.
        System.out.println(var.repeat(2) == "--");// did not give error beause is not assigned.
    }
}