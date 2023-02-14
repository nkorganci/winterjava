package day41designpatterns.datastructure.twopointers;

public class RemoveDuplicatesInAnArray {
    public static void main(String[] args) {

    }

    public static int removeDuplicate(int[] arr) {

        int left=0;
        int right =1;
        while (right<arr.length){
            if(arr[left]!=arr[right]){
                left++;
                arr[left]=arr[right];
            }
            right++;
        }
        return left+1;

    }
}
