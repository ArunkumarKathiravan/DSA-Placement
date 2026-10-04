package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        int[] current = Arrays.copyOf(intervals[0], 2);
        merged.add(current);
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = Arrays.copyOf(next, 2);
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] result = merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
