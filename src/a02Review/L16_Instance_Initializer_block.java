package a02Review;

public class L16_Instance_Initializer_block {

}
// 1 Instance block worked each time.
class BB{
    int speed;

    BB(){
        System.out.println("speed is " + speed);
    }

    // Instance initializer block
    {speed=100;}

    public static void main(String[] args) {
        BB obj = new BB();
        BB obj1 = new BB();
    }
}

// 2 What is invoked first, instance initializer block or constructor?

class BB1{
    int speed;
    //Constructor
    BB1(){
        System.out.println("constructor");
    }
    //Instance initializer block
    {
        System.out.println("instance initializer block");
    }

    public static void main(String[] args) {
        BB1 obj = new BB1();
    }
}

