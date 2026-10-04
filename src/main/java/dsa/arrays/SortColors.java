package dsa.arrays;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0;
        int current = 0;
        int high = nums.length - 1;
        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, low++, current++);
            } else if (nums[current] == 2) {
                swap(nums, current, high--);
            } else if (nums[current] == 1) {
                current++;
            } else {
                throw new IllegalArgumentException("Values must be 0, 1, or 2");
            }
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
