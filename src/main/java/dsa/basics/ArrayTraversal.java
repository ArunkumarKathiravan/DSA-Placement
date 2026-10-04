package dsa.basics;

import java.util.Arrays;

public class ArrayTraversal {
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static int maximum(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int best = values[0];
        for (int value : values) {
            best = Math.max(best, value);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] values = {4, 1, 7, 3};
        System.out.println("Values: " + Arrays.toString(values));
        System.out.println("Sum: " + sum(values));
        System.out.println("Maximum: " + maximum(values));
    }
}
