package dsa.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums.length == 0) {
            return;
        }
        int rotations = Math.floorMod(k, nums.length);
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, rotations - 1);
        reverse(nums, rotations, nums.length - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
