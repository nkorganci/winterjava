package a02Review;

public class L12_Overloading {
    static void run(){
        System.out.println("Running");
    }
    void run(int a){
    }
    void run(String b){
        System.out.println("Hello");
    }
    int run1 (String b){
        System.out.println(b);
        return 1;
    }
}
