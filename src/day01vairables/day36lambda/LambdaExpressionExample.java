package day01vairables.day36lambda;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        Car car = (t)-> System.out.println("Car move " +t);
        car.move(4);
    }

}

interface Car{
    void move(int t);
}
