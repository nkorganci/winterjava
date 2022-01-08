package day31a_Collections;

import java.util.Currency;
import java.util.Locale;

public class A {

    public static void main(String[] args) {
        Locale lc = Locale.CANADA;
        Currency curr = Currency.getInstance(lc);
        System.out.println("code: " + curr.getCurrencyCode());
        System.out.println(curr);
        System.out.println(lc);
    }
}
