package day41designpatterns.datastructure.recursion.recursionudemy;

public class ArrayNumbersProducts {
    public static void main(String[] args) {

    }

    public static int multiplyArrayElements(int[] num, int n){

       if(n<=0)
           return num[n];
       return num[n]*multiplyArrayElements(num,n-1);
    }
}
