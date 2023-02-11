package day01vairables.day30interfaces_43.socrative_Interfaceabstract_46;

public interface Interface02 {
    int x =2;
    char c = 'A';
    void myMethod();
    void myMethod(char c, int x);
}

class Test02 implements Interface02 {

    int x = 3;
    char c ='B';

    @Override
    public void myMethod() {
        System.out.println("No parameter: "  + Interface02.c + x );
        System.out.println("No parameter: "  + c + x );

    }

    @Override
    public void myMethod(char c, int x) {
        System.out.println("One parameter: " + c + Interface02.x);
        System.out.println("One parameter: " + c + x);

    }

    public static void main(String[] args) {

        Test02 obj = new Test02();
        obj.myMethod();
        obj.myMethod('Z',7);
    }
}


