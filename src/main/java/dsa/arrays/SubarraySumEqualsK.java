package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixFrequencies = new HashMap<>();
        prefixFrequencies.put(0, 1);
        int prefix = 0;
        int count = 0;
        for (int value : nums) {
            prefix += value;
            count += prefixFrequencies.getOrDefault(prefix - k, 0);
            prefixFrequencies.put(prefix, prefixFrequencies.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
    }
}
