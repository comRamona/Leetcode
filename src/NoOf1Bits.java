/**
 * Created by rama on 16/01/16.
 * Does what the title says
 */
public class NoOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int nr = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            int get = (n & mask) == 0 ? 0 : 1;
            if (get == 1) nr++;
        }
        return nr;
    }
}