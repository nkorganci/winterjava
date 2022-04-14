package a01codingpractice.codesignal;

public class Centry {
    static void find(int year){
        if(year<0){
            System.out.println("Do not write zero");
        }else if(year<100){
            System.out.println("1st Centry");
        }else if(year%100==0){
            System.out.println(year%100 + " centry");
        }else {
            System.out.println(year/100 + 1 + " century");
        }
    }
}




class Test {
    public static void main(String[] args) {
        for(int i = 0; true; i++) {
            System.out.println("Hello");
            break;
        }
    }
}