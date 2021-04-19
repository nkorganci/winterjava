package day41javadeveloper;

public class Q021StringBuilder {
}

 class Q021 {

    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("ABCD");

        s.replace(s.indexOf("B"), s.indexOf("C"), "Q");
        System.out.println(s);
    }

}
//Which would cause s to be AQCD?
/*
A. s.replace(s.indexOf(“A”), s.indexOf(“C”), “Q”);
B. s.replace(s.indexOf(“B”), s.indexOf(“C”), “Q”);
C. s.replace(s.indexOf(“B”), s.indexOf(“B”), “Q”);
D. s.replace(s.indexOf(“A”), s.indexOf(“B”), “Q”);*/

//first index started point ikinci index end point olmali o yuzden cevap B