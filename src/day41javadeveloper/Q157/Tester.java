package Q157;

public class Tester {//Answer: D
    public static void main(String[] args) {
        String s = "this is it";
        int x = s.indexOf("is");
        s.substring(x+3);
        x=s.indexOf("is");
        System.out.println(s+" "+x);
    }
}
//What is the result?
//A. is it 1
//B. An IndexOutOfBoundsException is thrown at runtime. C. is it 0
//D. this is it 2
//E. this is it 3

