package a02Review;

public class L11_Aggregation {
}

class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
    Operation op;// aggregation
    double pi = 3.14;

    double area(int radius){
        op = new Operation();
        int rsquare = op.square(radius); // code reusability
        return pi*rsquare;
    }

    public static void main(String[] args) {


    }
}