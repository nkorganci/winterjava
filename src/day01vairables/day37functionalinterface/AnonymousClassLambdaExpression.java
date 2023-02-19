package day01vairables.day37functionalinterface;

public class AnonymousClassLambdaExpression {


}

class ThreadTest{
    public static void main(String[] args)  {
        Runnable r1 = new Runnable() { // Anonymous class
            @Override
            public void run() {
                System.out.println("Using anonymous class");

            }
        };

        Runnable r2 = ()->{
            System.out.println("Using lambda Expression");
        };

        new Thread(r1).start();
        new Thread(r2).start();

    }
}
