package Q147;

public class Over {//Answer: D
    public void analyze(Object[] o){
        System.out.println("I am an object array");
    }
    public void analyze(long[] l){
        System.out.println("I am an array");
    }
    public void analyze(Object o ){
        System.out.println("I am an object");
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        new Over().analyze(nums);   ///line1
    }
    /*
    What is the output?
A. I am an object array
B. The compilation fails due to an error in line 1.
C. I am an array
D. I am an object





     */
}
