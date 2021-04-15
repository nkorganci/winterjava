package day37oca18.q1_10;

import java.io.IOException;

class X {
    public void printFileContent() {
        /*code goes here */
        // throw new IOException();       // Compile time error
    }
}

class Test {
    public static void main(String[] args) {
        Q006 xobj = new Q006();
        //xobj.printFileContent();		  //Run Time error gave
    }
}


//Solution

class X1 {
    public void printFileContent() throws IOException {
        /*code goes here */
        throw new IOException();
    }
}

class Test1 {
    public static void main(String[] args) throws Exception {
        Q006 xobj = new Q006();
        xobj.printFileContent();
    }
}
