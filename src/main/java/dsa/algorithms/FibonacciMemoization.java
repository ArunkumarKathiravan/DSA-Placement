package dsa.algorithms;

public class FibonacciMemoization {
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        long[] memo = new long[n + 1];
        return calculate(n, memo);
    }

    private static long calculate(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = calculate(n - 1, memo) + calculate(n - 2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
