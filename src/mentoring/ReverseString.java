package mentoring;

public class ReverseString {

    public static void main(String[] args) {

        int w = 10;


    }
}

interface Addable {

    public int add(int a, int b);
}

class L {
    public static void main(String[] args) {

        Addable a1 = (a,b) -> (a+ b);
        System.out.println(a1.add(10,20));

    }
}
