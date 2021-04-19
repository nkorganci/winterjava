package day41javadeveloper;

class Q001 {
}

class A {
     boolean checkValue(int val) {
        return true; // Returned true
    }

}

class B extends A {
    public int modifyVal(int val) {
        if (checkValue(val)) { // Compile time error, delete private.
            return val;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.modifyVal(10));

    }

}

//A. nothing
// B. It fails to compile.// Because can not reach to private method
// C. 0
// D. A java.lang.IllegalArgumentException is thrown.
// E. 10