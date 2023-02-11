package day01vairables.day36lambda;

public class LambdaExpression {

    public static void main(String[] args) {

       FunctionInterface obj = new FunctionInterface() {
           @Override
           public void run(int x) {

           }

           @Override
           public void fly(int y) {

           }
       };
    }

}


interface FunctionInterface {
    void run(int x);
    void fly(int y);
}
