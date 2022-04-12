package a02Review.lambdaexpressions;

public interface Functional {
    public int cal(int a, int b);
}

class A {
    public static void main(String[] args) {
        Functional addition = new Functional() {
            @Override
            public int cal(int a, int b) {
                return a+b;
            }
        };

     Functional sub = new Functional() {
         @Override
         public int cal(int a, int b) {
             return a-b;
         }
     };

        System.out.println(addition.cal(2,5));
        System.out.println(sub.cal(3,1));
    }


}
