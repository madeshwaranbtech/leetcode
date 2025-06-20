import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<>();
        
        for (int i = left; i <= right; i++) {
            if (prime(i)) {
                primes.add(i);
            }
        }
        
        if (primes.size() <= 1) {
            return new int[] {-1, -1};
        }
        
        int minDiff = Integer.MAX_VALUE;
        int prime1 = -1;
        int prime2 = -1;
        
        for (int i = 0; i < primes.size() - 1; i++) {
            int current = primes.get(i);
            int next = primes.get(i + 1);
            int diff = next - current;
            
            if (diff < minDiff) {
                minDiff = diff;
                prime1 = current;
                prime2 = next;
            }
        }
        
        return new int[] {prime1, prime2};
    }
    
    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
