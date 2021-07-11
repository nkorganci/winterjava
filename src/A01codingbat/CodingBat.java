package A01codingbat;

public class CodingBat {
    public static void main(String[] args) {

        int [] a = {1,2,6};
        System.out.println(coding(a));

    }

    public static int[] coding(int[] a, int[] b){

   int []  sum = new int[4];
   for(int i=0;i<a.length;i++){
       sum[i]=a[i];
   }
   for(int j=0;j<b.length;j++){
       sum[a.length+j]=b[j];
   }
   return sum;

