/**
 * Created by rama on 20/01/16.
 * Write a program to find the n-th ugly number.
 * <p>
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
 * //dynammic programming
 */
public class UglyNumbersNth {
    public int nthUglyNumber(int n) {
        int[] d = new int[n];
        d[0] = 1;
        int f2 = 2, f3 = 3, f5 = 5;
        int ix2 = 0, ix3 = 0, ix5 = 0;
        for (int i = 1; i < n; i++) {
            int minV = Math.min(Math.min(f2, f3), f5);
            d[i] = minV;
            if (minV == f2) f2 = 2 * d[++ix2];
            if (minV == f3) f3 = 3 * d[++ix3];
            if (minV == f5) f5 = 5 * d[++ix5];
        }

        return d[n - 1];

    }
}
