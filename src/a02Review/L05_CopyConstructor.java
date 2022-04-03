package a02Review;

public class L05_CopyConstructor {


}

class B{
    int a;
    int b;

    B(){

    }

    B(int a, int b){
        this.a=a;
        this.b=b;
    }

    B(B obj){// Constructor AS A PARAMETER to initialize another object.
        a= obj.a;
        b= obj.b;
    }

    void add(int a, int b){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        B s1 = new B(2,4);
        B s2 = new B(s1); // Object is given as a parameter

        // Copying values without constructor
        B s3 = new  B();
        s3.a= s1.a;
        System.out.println("S3 is copied the values " + s3.a);
    }
}
