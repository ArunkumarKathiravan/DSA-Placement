package dsa.arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int candidate = 0;
        int votes = 0;
        for (int value : nums) {
            if (votes == 0) {
                candidate = value;
            }
            votes += value == candidate ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
