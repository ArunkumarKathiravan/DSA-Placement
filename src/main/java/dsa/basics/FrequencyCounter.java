package dsa.basics;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static Map<Integer, Integer> count(int[] values) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int value : values) {
            frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
        }
        return frequencies;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{2, 1, 2, 3, 1, 2}));
    }
}
