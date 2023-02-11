package day01vairables.day34maps.recursion;

public class WhileLoopRecursion {
    public static void main(String[] args) {

        countDown(5);
    }
    public static void countDown(int num){

        if(num<1)  // Base Call
            return;
        System.out.println("hi" + num);
        countDown(num-1); // RecursiveCall
    }

    public static void whileLoop(){
        int n=0;
        while (n<5){
            System.out.println(n+" Hi");
            n++;
        }
    }
}
