package day41javadeveloper;

public class Q037Constructor {
}

class ConSuper {
    protected ConSuper (){
        this (2);
        System.out.println("1");
    }
    protected ConSuper (int a) {
        System.out.println(a);
    }
}

class ConSub extends ConSuper {

    ConSub(){
        this (4);
        System.out.println("3");
    }
    ConSub (int a){
        System.out.println(a);
    }
    public static void main (String [] args){
        new ConSub(4);
    }
}

/*
What is the result?
A.2134
B.2143
C.214
D.234
Answer: C

 */