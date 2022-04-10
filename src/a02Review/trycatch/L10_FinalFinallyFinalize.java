package a02Review.trycatch;

public class L10_FinalFinallyFinalize {
}

class E{
    public static void main(String[] args) {
        E obj = new E();

        System.out.println("Hashcode " + obj.hashCode());
        obj = null;
        System.gc();
        System.out.println("end");
    }
}