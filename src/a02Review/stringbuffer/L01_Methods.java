package a02Review.stringbuffer;

public class L01_Methods {

    public static void main(String[] args) {
    String str = "Hi";


    StringBuffer sb  = new StringBuffer("Initial  ");
        System.out.println(sb.capacity());
    sb.reverse();

        System.out.println(sb);


        StringBuilder s = new StringBuilder();
        s.append("hi");
        s.append(2);

        System.out.println(s);
}
}

