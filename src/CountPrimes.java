/**
 * Created by rama on 26/12/15.
 * Count prime numbers smaller than n
 */
public class CountPrimes {
    public int countPrimes(int n) {
        int[] sieve = new int[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (sieve[i] == 0) {
                for (int j = i * i; j < n; j += i)
                    sieve[j] = -1;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++)
            if (sieve[i] == 0) count++;
        return count;
    }
}
