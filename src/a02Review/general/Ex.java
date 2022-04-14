package a02Review.general;

import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        System.out.println(3.0/0);

        /**  hi*/ // Javadoc

        List  obj = new ArrayList(3);

        Class.class.getName();
        System.out.println(Class.class.getName());


    }
}

class FF implements Cloneable{
    int a = 2;
    static int b =3;
    public static void main(String[] args) throws Exception {
        FF obj = new FF();
        System.out.println(obj.a=44);
        FF obj1 = (FF)obj.clone();
        System.out.println(obj1.a);


    }
}
