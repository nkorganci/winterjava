package day25overridingexceptions_36.exception01;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        try{
            int a[] = {2, 3, 5};
            a[4]= 33;
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
    }

}
