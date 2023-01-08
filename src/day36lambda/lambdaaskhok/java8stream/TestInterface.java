package day36lambda.lambdaaskhok.java8stream;


@FunctionalInterface// If you write this it means , java checks this annotation
public interface TestInterface {
    public void run();
}

//2nd Interface class

interface Addition {
    int add(int a, int b);
}

//1 Regular way to implement interface
class Example implements TestInterface {

    public static void main(String[] args) {

        Example obj = new Example();
        obj.run();
    }

    @Override
    public void run() {
        System.out.println("Run called: :)");
    }
}

// 2 Implement interface via Lambda expression

class ExampleLambda {

    public static void main(String[] args) {
        //1st interface implemented
        TestInterface t = () -> System.out.println("test interface imported");
        t.run();

        //2nd Interface implemented
        Addition addition = (x, y) -> {
            System.out.println("add from ");
            return x + y;
        };
        System.out.println(addition.add(3, 5));

    }
}