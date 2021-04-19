package Q139;

public class Test {
    private int sum;
    public int compute(){
        int x = 0;
        while(x<3){
            sum+= x++;
        }
        return sum;
    }
    public static void main(String[] args){
        Test t = new Test();
        int sum = t.compute();
        sum = t.compute();
        t.compute();
        System.out.println(sum);
    }
}

//What is the result?
//A. 9
//B. An exception is thrown at runtime.
// C. 3
//D. 6
//Answer: D
