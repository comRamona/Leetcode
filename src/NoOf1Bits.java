/**
 * Created by rama on 16/01/16.
 * Does what the title says
 */
public class NoOf1Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int nr = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            int get = (n & mask) == 0 ? 0 : 1;
            if (get == 1) nr++;
        }
        return nr;
    }

    public static int hammingWeight2(int n) {
        int nr = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) nr++;
            n = n >> 1;
        }
        return nr;
    }

    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(hammingWeight(n));
        System.out.println(hammingWeight2(n));
    }
}