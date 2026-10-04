package dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int value : nums) {
            values.add(value);
        }
        int longest = 0;
        for (int value : values) {
            if (value == Integer.MIN_VALUE || !values.contains(value - 1)) {
                int length = 1;
                int next = value;
                while (next != Integer.MAX_VALUE && values.contains(next + 1)) {
                    next++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
