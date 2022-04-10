package a02Review.trycatch;

public class L07_NestedTryCatch {
}

class Nested{
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Going to divide by 0");
                int b= 39/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            try{
                int []a = new int[5];
                a[5]= 88;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("other after inner ");
        }catch (java.lang.Exception e){
            System.out.println("outer");
        }
        System.out.println("Regular");
    }
}


// If inner does not work

class NestedTryBlock2 {

    public static void main(String args[])
    {
        // outer (main) try block
        try {

            //inner try block 1
            try {

                // inner try block 2
                try {
                    int arr[] = { 1, 2, 3, 4 };

                    //printing the array element out of its bounds
                    System.out.println(arr[10]);
                }

                // to handles ArithmeticException
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }

            // to handle ArithmeticException
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }

        // to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print(e4);
            System.out.println(" outer (main) try block");
        }
        catch (java.lang.Exception e5) {
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}
