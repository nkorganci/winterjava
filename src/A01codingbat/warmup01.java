package A01codingbat;

public class warmup01 {
    public static void main(String[] args) {

        int [] a ={2,6,9,9};
        System.out.println(ex(a));
    }

    public static int ex(int [] nums) {

    int counter=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==6&&(nums[i+1]==6||nums[i+1]==7){
            counter++;
        }
    }
    return counter;
}