package day01vairables.day40CodeUsingJava;

/*
Explanation -
In the case statements the variable 4 for case is in single quotes which
means it is a character.

A char is simply an unsigned 16-bit number,  so since it's basically a subset of the int type, the JVM can cast it without any ambiguity.
Integer month = 4;  -  Integer cannot be cast to char(as required in switch statement) so
compile time exception
int month = 4; -  int can be cast to char but 4 and '4' are different. It will print UNPREDICTABLE WEATHER
int month = '4'  -  will print IT WILL RAIN
 */
public class Switch01 {
}

class Test03 {
    public static void main(String[] args) {
        /*INSERT*/ int month= '4';
        switch(month) {
            case '4':
                System.out.println("IT WILL RAIN");
                break;
            default:
                System.out.println("UNPREDICTABLE WEATHER");
        }
    }
}





