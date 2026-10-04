package dsa.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static List<Integer> primesUpTo(int limit) {
        boolean[] composite = new boolean[Math.max(0, limit + 1)];
        List<Integer> primes = new ArrayList<>();
        for (int candidate = 2; candidate <= limit; candidate++) {
            if (!composite[candidate]) {
                primes.add(candidate);
                if (candidate <= limit / candidate) {
                    for (int multiple = candidate * candidate; multiple <= limit;
                         multiple += candidate) {
                        composite[multiple] = true;
                    }
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(primesUpTo(30));
    }
}
