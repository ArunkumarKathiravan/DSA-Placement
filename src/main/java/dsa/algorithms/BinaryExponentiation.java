package dsa.algorithms;

public class BinaryExponentiation {
    public static long power(long base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        long result = 1;
        long factor = base;
        int remaining = exponent;
        while (remaining > 0) {
            if ((remaining & 1) == 1) {
                result *= factor;
            }
            factor *= factor;
            remaining >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
