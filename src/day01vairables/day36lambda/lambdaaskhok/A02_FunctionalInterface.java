package day01vairables.day36lambda.lambdaaskhok;

@FunctionalInterface
public interface A02_FunctionalInterface {
    public void speak();
}

class B {

    public static void main(String[] args) {
       A02_FunctionalInterface fi= ()-> System.out.println(" speak method is called"   );
       fi.speak();
    }
}
