package dsa.algorithms;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
    }
}
