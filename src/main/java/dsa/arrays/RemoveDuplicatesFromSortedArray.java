package dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueEnd = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueEnd - 1]) {
                nums[uniqueEnd++] = nums[i];
            }
        }
        return uniqueEnd;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, length)));
    }
}
