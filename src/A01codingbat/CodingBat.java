package A01codingbat;

public class CodingBat {
    public static void main(String[] args) {

        int [] a = {1,2,6};
        System.out.println(coding(a));
        coding1(a);
    }

    public static int[] coding(int[] a){
        int [] c= new int[2];

        if(a.length==1){
            c[0]=a[0];
            c[1]=a[0];
        }else {
                c[0]=a[0];
                c[1]=a[a.length-1];
    }
        return c;
    public static void coding1(int [] nums){

        System.out.println(nums[nums.length-1]);


    }

}
