package a02Review.stringc;

public class CallByValue {
    int data=40;
    void change(CallByValue c){
        c.data=c.data+33;
    }
    public static void main(String[] args) {

        CallByValue obj = new CallByValue();
        System.out.println(obj.data);
        obj.change(obj);
        System.out.println(obj.data);
    }
}
