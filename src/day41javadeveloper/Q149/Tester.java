package Q149;

public class Tester {
    public static void main(String[] args) {
        A obj = new B();            //line 4
        System.out.println(obj.x);  //line 5
    }
}
//What is the result?
//A. 42
//B. The compilation fails due to an error in line 4.
// C. 17
//D. The compilation fails due to an error in line 3.
// E. The compilation fails due to an error in line 2.
// F. The compilation fails due to an error in line 1.
// G. The compilation fails due to an error in line 5. Answer: A
