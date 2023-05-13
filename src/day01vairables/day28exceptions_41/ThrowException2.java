package day01vairables.day28exceptions_41;

public class ThrowException2 {



    public static void main(String[] args) {
        String string = null;
        try {
            if(string==null) {
                throw new NullPointerException("String is null adf");
            }
        }catch (NullPointerException e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
