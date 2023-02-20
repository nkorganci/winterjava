package day01vairables.day36lambda;

import a02Review.lambdaexpressions.Functional;

import java.util.function.Function;

public class L12_FunctionExpression {

    public static void main(String[] args) {
        Function<Integer,Integer> f = n->n*n;
        System.out.println(f.apply(4));
    }

}
