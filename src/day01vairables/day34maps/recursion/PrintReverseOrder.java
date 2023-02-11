package day01vairables.day34maps.recursion;

public class PrintReverseOrder {
    public static void main(String[] args) {
        printRever(2,9);
    }

    public static void printRever(int a, int b){
        if(a>b)
            return;
        System.out.println("b: "+b);
        printRever(a,b-1);
    }
}
