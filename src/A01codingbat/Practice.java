package A01codingbat;

public class Practice {
    public static void main (String[] args){
        System.out.println(print(0));
    }
    static Exception print(int i){
        if (i>0) {
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }


}

