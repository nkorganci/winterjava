package day42designpatterns;

public class AbstractFactory {
    public static void main(String[] args) {

    }
}

interface Shape{
    void draw();
}

class RoundedRectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Rounded draw");
    }
}

 class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}

abstract class AbstractFactory1 {
    abstract Shape getShape(String shapeType) ;
}
