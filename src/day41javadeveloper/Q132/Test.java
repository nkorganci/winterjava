package Q132;

public class Test extends CustomType{
    public static void main(String[] args) {
        String [] words =("banana","orange","apple","lemon");
        Integer []numbers={1,2,3,4,5};
        CustomType type= new CustomType();
        CustomType <String> stringType= new CustomType<>();
        System.out.println(stringType.count(words,"apple"));
        System.out.println(type.count(words,"apple"));
        System.out.println(type.count(numbers,3));

    }
}

/*
What is the result?
A. A NullPointerException is thrown at run time.
B. The compilation fails.
C. 1
Null
null
D. 1
1
1
E. A ClassCastException is thrown at run time.
Answer: B
 */