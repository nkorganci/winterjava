package day41designpatterns.datastructure.twopointers;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {

    }

    public static int maxArea(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            water = Math.max(water, Math.min(height[left], height[right]) * (right - left));
            if (height[left] > height[right]) {
                right--;
            }
        }
        return water;

    }

    public static int maxArea1(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            int area = (right - left) * Math.min(height[right], height[left]);
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]) {
                left++;

            } else {
                right--;
            }
        }
        return maxArea;
    }
}
