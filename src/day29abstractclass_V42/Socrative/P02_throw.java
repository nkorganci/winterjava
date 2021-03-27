package day29abstractclass_V42.Socrative;

public class P02_throw {
//    public static void main(String[] args) {
//        try{
//            run();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
//        private static void run() {
//            throw new RuntimeException("Run More");
//        }
}

class A {
    public static void main(String[] args) {

        try {
            //int a= 2/0;
            throw new RuntimeException("Run More");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
