package a04geeksforgeeks;
public class Set1 {
}

class Car{
String name;
Car(String name){
    this.name= name;
}
}
class Garage{
void park(Car car){
    System.out.println("The car " + car.name + " is garage");
}
}

class Main{
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("BMW");
        garage.park(car);

    }
}
