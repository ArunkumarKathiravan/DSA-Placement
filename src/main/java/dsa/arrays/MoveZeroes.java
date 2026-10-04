package dsa.arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nextNonZero = 0;
        for (int value : nums) {
            if (value != 0) {
                nums[nextNonZero++] = value;
            }
        }
        while (nextNonZero < nums.length) {
            nums[nextNonZero++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
