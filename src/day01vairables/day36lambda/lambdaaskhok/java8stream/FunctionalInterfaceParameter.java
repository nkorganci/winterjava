package day01vairables.day36lambda.lambdaaskhok.java8stream;

public interface FunctionalInterfaceParameter {

    int add(int a,int b);
}

class Test{
    public static void main(String[] args) {
       FunctionalInterfaceParameter f =  (x,y)->x+y;
       f.add(3,8);


    }
}
