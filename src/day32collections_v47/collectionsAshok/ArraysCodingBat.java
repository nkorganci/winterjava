package day32collections_v47.collectionsAshok;

public class ArraysCodingBat {

    public static void main(String[] args) {

    }

    public int firstLast6(int[] nums){

        int totalNum=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                totalNum++;
            }
        }
        return totalNum;

    }
}
