package day01vairables.day34maps.recursion;

public class InfiniteTimes {
    static int count=0;

    public static void main(String[] args) {

        p();

    }

    public static void p(){

   count++;
   if(count<=5){
       System.out.println("hello "  + count);
       p();
   }

    }
}
