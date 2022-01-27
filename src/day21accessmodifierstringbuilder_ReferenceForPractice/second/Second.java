package day21accessmodifierstringbuilder_ReferenceForPractice.second;

import day21accessmodifierstringbuilder_ReferenceForPractice.first.First;

public class Second {
    public static void main(String[] args) {
        First b = new First("Second Package");
        System.out.println(b.str);
        b.show(); // show() has showStr() method
    }
}
