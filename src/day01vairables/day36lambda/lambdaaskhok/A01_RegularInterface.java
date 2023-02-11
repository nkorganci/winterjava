package day01vairables.day36lambda.lambdaaskhok;

public interface A01_RegularInterface {
    public void run();
}

class A implements A01_RegularInterface{

    @Override
    public void run() {
        System.out.println("run ");
    }

    public static void main(String[] args) {

        A obj = new A();
        obj.run();
    }
}
