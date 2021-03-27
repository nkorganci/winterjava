package day26exceptions_37.Socrative_Overriding_Overloading;


public class P04_Override01 {

    private void go() {
        System.out.println("Good");
    }
}

class Test extends P04_Override01 {
    //@Override //If I write annotation, it will give compile time error. Otherwise work properly
    public void go() {
        System.out.println("Bad");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.go();
    }
}

